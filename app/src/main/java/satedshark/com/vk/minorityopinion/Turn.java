package satedshark.com.vk.minorityopinion;

import java.util.Date;

public class Turn {
    private static int NUMBER = 0;

    //region fields
    private int numberTurn;
    private Player player;
    private Game game;
    private Date date;
    private boolean isAorB;
    //endregion

    public Turn(){
        numberTurn = NUMBER;
        NUMBER++;
        date = new Date();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    public Player getPlayer() {
        return player;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setAorB(boolean AorB) {
        isAorB = AorB;
    }
    public boolean getAorB(){
        return isAorB;
    }

    public int getNumberTurn() {
        return numberTurn;
    }
}
