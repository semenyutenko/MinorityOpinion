package satedshark.com.vk.minorityopinion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameLab {

    private static GameLab gameLab;

    private List<Game> games;

    public static GameLab get() {
        if (gameLab != null) return gameLab;
        gameLab = new GameLab();
        return gameLab;
    }

    private GameLab() {
        games = new ArrayList<>();
    }

    public void newGame(){
        Game game = new Game();
        game.setQuestion("Game #" + games.size());
        game.setAnswerA("Answer A for game #" + games.size());
        game.setAnswerB("Answer B for game #" + games.size());
        game.setBate(new Random().nextDouble() * 10);
        games.add(game);
    }

    public List<Game> getGames() {
        return games;
    }
}
