package Quiz;

import BrothersHelp.QuestionLoader;

import java.util.List;
/**
 * Handles the logic of the quiz.
 * Manages the list of questions, the current position in the quiz, and the number of correct answers.
 */
public class QuizLogic {

    private List<Question> questions;
    private int actualIndex;
    private int numberOfCorrect;


    public QuizLogic() {
        questions = QuestionLoader.loadQuestions();
        actualIndex = 0;
        numberOfCorrect = 0;
    }

    /**
     * Returns the current question based on the internal index.
     * @return the current question or null.
     */
    public Question getActualQuestion() {
        if (actualIndex < questions.size()) {
            return questions.get(actualIndex);
        }
        return null;
    }

    /**
     * Processes the user's answer to the current question.
     * If the answer is correct, increments the correct answer counter.
     * Then increases the index to the next question.
     *
     * @param indexOdpovedi the index of the chosen answer (0–3)
     * @return true if the answer was correct, otherwise false
     */
    public boolean answer(int indexOdpovedi) {
        Question q = getActualQuestion();
        boolean correct = (q.getCorrect() == indexOdpovedi);
        if (correct) {
            numberOfCorrect++;
        }
        actualIndex++;
        return correct;
    }


    public boolean end() {
        return actualIndex >= questions.size();
    }

    public int getNumberOfCorrect() {
        return numberOfCorrect;
    }

    public int getTotal() {
        return questions.size();
    }


    public int getNumberOfQuestion() {
        return actualIndex + 1;
    }
}