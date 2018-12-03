package satedshark.com.vk.minorityopinion;

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
        Player player = new Player();
        for (int i = 0; i < NAME_LIST.length; i++){
            player.setPlayerName(NAME_LIST[i]);
            player.setAccount(new Random().nextDouble() * 30 + 50);
            players.add(player);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}
