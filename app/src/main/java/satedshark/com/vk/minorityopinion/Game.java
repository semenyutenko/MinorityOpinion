package satedshark.com.vk.minorityopinion;

import java.util.Date;

public class Game {

    private static int NUMBER = 0;
    public static final String CHOICE_A = "choice A";
    public static final String CHOICE_B = "choice B";

    //region fields
    private int gameNumber;
    private String question;
    private String answerA;
    private String answerB;
    private int countA = 0;
    private int countB = 0;
    private Date date;
    private double bate;
    private String choice;
    //endregion

    Game(){
        gameNumber = NUMBER;
        NUMBER++;
        date = new Date();
        choice = "";
    }

    void setQuestion(String question) {
        this.question = question;
    }
    String getQuestion() {
        return question;
    }

    void setAnswerA(String answerA) {
        this.answerA = answerA;
    }
    public String getAnswerA() {
        return answerA;
    }

    void setAnswerB(String answerB) {
        this.answerB = answerB;
    }
    public String getAnswerB() {
        return answerB;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    Date getDate() {
        return date;
    }

    void setBate(double bate) {
        this.bate = bate;
    }
    double getBate() {
        return bate;
    }

    public int getGameNumber() {
        return gameNumber;
    }


}
