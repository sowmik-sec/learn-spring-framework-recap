package com.sowmik.learnspringframeworkrecap.game;

public class GameRunner {
    //private MarioGame game;
    private SuperContraGame game;

    public GameRunner(SuperContraGame marioGame) {
        this.game = marioGame;
    }
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
