package satedshark.com.vk.minorityopinion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerLab {
    private static final String[] NAME_LIST = {"John", "Ben", "Tim", "Arnold", "Fred", "Garold", "Sam"};
    private static PlayerLab playerLab;

    private List<Player> players;

    public static PlayerLab get(){
        if (playerLab != null) return playerLab;
        playerLab = new PlayerLab();
        return playerLab;
    }

    private PlayerLab(){
        players = new ArrayList<>();
        for (int i = 0; i < NAME_LIST.length; i++){
            Player player = new Player();
            player.setPlayerName(NAME_LIST[i]);
            player.setPlayerAccount(Math.round((new Random().nextDouble() * 30 + 50) * 100) / 100.0);
            if (i == 0) player.setPlayerPassword("as1500");
            else player.setPlayerPassword(newPass(6));
            players.add(player);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String newPass(int symbols){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < symbols; i++){
            char symbl = alphabet.charAt(new Random().nextInt(alphabet.length()));
            pass.append(symbl);
        }
        return pass.toString();
    }
    
    public int isLegal (String login, String pass){
        for (Player player: players) {
            if(player.getPlayerName().equals(login) && player.isAcceptable(pass))
                return player.getPlayerNumber();
            }
            return -1;
        }

    public void newPlayer(String name, String password){
        Player newPlayer = new Player();
        newPlayer.setPlayerName(name);
        newPlayer.setPlayerPassword(password);
        players.add(newPlayer);
    }
    
    public Player getPlayer(int playerNumber) throws RuntimeException{
        for (Player player:players) {
            if(player.getPlayerNumber() == playerNumber) return player;
        }
        throw new RuntimeException("This user doesn't exist");
    }
}
