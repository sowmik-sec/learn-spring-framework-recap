package com.sowmik.learnspringframeworkrecap;

import com.sowmik.learnspringframeworkrecap.game.GameRunner;
import com.sowmik.learnspringframeworkrecap.game.MarioGame;
import com.sowmik.learnspringframeworkrecap.game.PacmanGame;
import com.sowmik.learnspringframeworkrecap.game.SuperContraGame;

public class AppGamingBasicJava {
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
