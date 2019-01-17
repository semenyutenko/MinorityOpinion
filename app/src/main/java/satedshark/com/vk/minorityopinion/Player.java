package satedshark.com.vk.minorityopinion;

public class Player {

    private static int NUMBER = 0;

    //region fields
    private int playerNumber;
    private String playerName;
    private double playerAccount;
    private String playerPassword;
    //endregion

    public Player(){
        playerNumber = NUMBER;
        NUMBER++;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerAccount(double playerAccount) {
        this.playerAccount = playerAccount;
    }
    public double getPlayerAccount() {
        return playerAccount;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }
    public boolean isAcceptable(String key_pass){
        return key_pass.equals(playerPassword);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
