package satedshark.com.vk.minorityopinion;


import java.util.Date;

public class Comment {
    private static int NUMBER = 0;

    //region fields
    private int numberComment;
    private  Player aphtor;
    private Game game;
    private Date date;
    private String text;
    //endregion

    public Comment (){
        numberComment = NUMBER;
        NUMBER++;
        date = new Date();
    }

    public void setAphtor(Player aphtor) {
        this.aphtor = aphtor;
    }
    public Player getAphtor() {
        return aphtor;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText(){return text;}

    public int getNumberComment() {
        return numberComment;
    }
}
