package com.sowmik.learnspringframeworkrecap;

import com.sowmik.learnspringframeworkrecap.game.GameRunner;
import com.sowmik.learnspringframeworkrecap.game.GamingConsole;
import com.sowmik.learnspringframeworkrecap.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
