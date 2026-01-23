package com.hexports.ebp.blackjack.domain.port;

import com.hexports.ebp.blackjack.domain.Game;

public interface GameMonitor {
    void roundCompleted(Game game);
}