package com.hexports.ebp.blackjack.adapter.out.gamemonitor;

import com.hexports.ebp.blackjack.domain.Game;

public class GameResultDto {
    private final String playerName;
    private final String outcome;
    private final String playerHandValue;
    private final String dealerHandValue;

    public GameResultDto(String playerName, String outcome, String playerHandValue, String dealerHandValue) {
        this.playerName = playerName;
        this.outcome = outcome;
        this.playerHandValue = playerHandValue;
        this.dealerHandValue = dealerHandValue;
    }

    public static GameResultDto from(Game game) {
        // extract values from Game
        return new GameResultDto("V",
                                 game.determineOutcome().displayString(),
                                 String.valueOf(game.playerHand().value()),
                                 String.valueOf(game.dealerHand().value()));

    }

    public String getDealerHandValue() {
        return dealerHandValue;
    }

    public String getPlayerHandValue() {
        return playerHandValue;
    }

    public String getOutcome() {
        return outcome;
    }

    public String getPlayerName() {
        return playerName;
    }
}