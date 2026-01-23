package com.hexports.ebp.blackjack.domain.port;

import com.hexports.ebp.blackjack.domain.Game;
import com.hexports.ebp.blackjack.domain.StubDeck;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class GameMonitorTest {

    @Test
    public void playerStandsThenGameIsOverAndResultsSentToMonitor() throws Exception {
        GameMonitor gameMonitorSpy = spy(GameMonitor.class);

        Game game = new Game(StubDeck.playerStandsAndBeatsDealer(), gameMonitorSpy);
        game.initialDeal();

         //execute behavior that ends the game
        game.playerStands();

        verify(gameMonitorSpy).roundCompleted(any(Game.class));
    }
}
