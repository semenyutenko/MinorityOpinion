package satedshark.com.vk.minorityopinion;

public class Player {

    private static int NUMBER = 0;

    //region fields
    private int numberPlayer;
    private String playerName;
    private double account;
    //endregion

    public Player(){
        numberPlayer = NUMBER;
        NUMBER++;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setAccount(double account) {
        this.account = account;
    }
    public double getAccount() {
        return account;
    }

    public int getNumberPlayer() {
        return numberPlayer;
    }
}
