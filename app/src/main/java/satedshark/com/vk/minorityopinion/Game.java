package satedshark.com.vk.minorityopinion;

import java.util.Date;

public class Game {

    private static int NUMBER = 0;

    //region fields
    private int numberGame;
    private String textQuestion;
    private String answerA;
    private String answerB;
    private int countA = 0;
    private int countB = 0;
    private Date date;
    private double bate;
    //endregion

    public Game(){
        numberGame = NUMBER;
        NUMBER++;
        date = new Date();
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }
    public String getTextQuestion() {
        return textQuestion;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }
    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }
    public String getAnswerB() {
        return answerB;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setBate(double bate) {
        this.bate = bate;
    }
    public double getBate() {
        return bate;
    }

    public int getNumberGame() {
        return numberGame;
    }
}
