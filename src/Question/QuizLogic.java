package Question;

import BrothersHelp.QuestionLoader;

import java.util.List;

public class QuizLogic {

    private List<Question> questions;
    private int actualIndex;
    private int numberOfCorrect;

    public QuizLogic() {
        questions = QuestionLoader.loadQuestions();
        actualIndex = 0;
        numberOfCorrect = 0;
    }

    // Vrátí aktuální otázku
    public Question getActualQuestion() {
        if (actualIndex < questions.size()) {
            return questions.get(actualIndex);
        }
        return null;
    }

    // Zkontroluje odpověď, posune na další otázku, vrátí true pokud správně
    public boolean answer(int indexOdpovedi) {
        Question q = getActualQuestion();
        boolean correct = (q.getCorrect() == indexOdpovedi);
        if (correct) {
            numberOfCorrect++;
        }
        actualIndex++;
        return correct;
    }

    // Zjistí jestli je kvíz hotový
    public boolean end() {
        return actualIndex >= questions.size();
    }

    public int getNumberOfCorrect() {
        return numberOfCorrect;
    }

    public int getTotal() {
        return questions.size();
    }

    // Vrátí číslo aktuální otázky (1-5)
    public int getNumberOfQuestion() {
        return actualIndex + 1;
    }
}