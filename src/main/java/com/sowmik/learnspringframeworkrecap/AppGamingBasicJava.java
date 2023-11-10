package com.sowmik.learnspringframeworkrecap;

import com.sowmik.learnspringframeworkrecap.game.GameRunner;
import com.sowmik.learnspringframeworkrecap.game.MarioGame;
import com.sowmik.learnspringframeworkrecap.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
