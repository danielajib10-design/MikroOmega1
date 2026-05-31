package BrothersHelp;

import Quiz.Question;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility class responsible for loading, parsing, and shuffling quiz questions
 * from an external JSON file.
 */
public class QuestionLoader {

    private static int POCET_OTAZEK = 5;

    /**
     * Loads questions from the JSON resource file, shuffles them,
     * and returns a limited set.
     *  @return A randomized List of Question objects.
     */
    public static List<Question> loadQuestions() {
        List<Question> allQuestions = new ArrayList<>();

        try {

            String path = "resource/questions.json";
            String content = new String(Files.readAllBytes(Paths.get(path)));
            JSONArray pole = new JSONArray(content);

            for (int i = 0; i < pole.length(); i++) {
                JSONObject obj = pole.getJSONObject(i);

                String question = obj.getString("question");
                int correct = obj.getInt("correct");

                JSONArray answersPole = obj.getJSONArray("answers");
                String[] answers = new String[4];
                for (int j = 0; j < 4; j++) {
                    answers[j] = answersPole.getString(j);
                }

                allQuestions.add(new Question(question, answers, correct));
            }

        } catch (Exception e) {
            System.out.println("Otázky se nenačetly kvůli nějaké chybě " + e.getMessage());
        }


        Collections.shuffle(allQuestions);
        return allQuestions.subList(0, Math.min(POCET_OTAZEK, allQuestions.size()));
    }
}
