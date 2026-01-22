package com.hexports.ebp.blackjack;

import com.hexports.ebp.blackjack.domain.Deck;
import com.hexports.ebp.blackjack.domain.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlackjackGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackjackGameApplication.class, args);
    }

    @Bean
    public Game createGame() {
        return new Game(new Deck());
    }

}
