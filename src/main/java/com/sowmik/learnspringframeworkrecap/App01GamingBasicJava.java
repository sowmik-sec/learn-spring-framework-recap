package com.sowmik.learnspringframeworkrecap;

import com.sowmik.learnspringframeworkrecap.game.GameRunner;
import com.sowmik.learnspringframeworkrecap.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new SuperContraGame(); //1: Object Creation
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        gameRunner.run();
    }
}
