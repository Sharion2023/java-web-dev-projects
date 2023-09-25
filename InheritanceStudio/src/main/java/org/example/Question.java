package org.example;
import java.util.ArrayList;

public abstract class Question {
    public static int id = 1;

    private int nextId;

    private String question;
    private String answer;
    private ArrayList<String> questionChoices= new ArrayList<>();

    public Question(String question, String answer, ArrayList<String> questionChoices) {
        this.id= nextId;
        this.question = question;
        this.answer = answer;
        this.questionChoices = questionChoices;
        nextId ++;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public ArrayList<String> getQuestionChoices() {
        return questionChoices;
    }

    public void setQuestionChoices(ArrayList<String> questionChoices) {
        this.questionChoices = questionChoices;
    }
}


