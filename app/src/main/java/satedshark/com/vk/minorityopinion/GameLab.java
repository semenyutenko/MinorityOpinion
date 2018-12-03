package satedshark.com.vk.minorityopinion;

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
        for (int i = 0; i < 20; i++) {
            Game game = new Game();
            game.setTextQuestion("Game #" + i);
            game.setAnswerA("Answer A for game #" + i);
            game.setAnswerB("Answer B for game #" + i);
            game.setBate(new Random().nextDouble() * 10);
            games.add(game);
        }
    }

    public List<Game> getGames() {
        return games;
    }
}
