package com.sowmik.learnspringframeworkrecap;

import com.sowmik.learnspringframeworkrecap.game.GameRunner;
import com.sowmik.learnspringframeworkrecap.game.GamingConsole;
import com.sowmik.learnspringframeworkrecap.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
