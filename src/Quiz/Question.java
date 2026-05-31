package Quiz;

/**
 * Represents a single quiz question.
 *Hhave the question text, possible answers, and the index of the correct answer.
 */
public class Question {

    private String question;
    private String[] answers;
    private int correct;
    /**
     * Creates a new question with the given parameters.
     *
     * @param question the text of the question
     * @param answers  an array of four possible answers
     * @param correct  the index of the correct answer (0–3)
     */
    public Question(String question, String[] answers, int correct) {
        this.question = question;
        this.answers = answers;
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrect() {
        return correct;
    }
}