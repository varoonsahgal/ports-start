package com.hexports.ebp.blackjack.adapter.out.gamemonitor;

import com.hexports.ebp.blackjack.domain.Game;
import com.hexports.ebp.blackjack.domain.port.GameMonitor;
import org.springframework.web.client.RestTemplate;

public class HttpGameMonitor implements GameMonitor {
    @Override
    public void roundCompleted(Game game) {
        GameResultDto resultDto = GameResultDto.from(game);

        try {
            post("https://blackjack-game-monitor.herokuapp.com/api/gameresults", resultDto);
            // Implementation to send game result via HTTP
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void post (String uri, GameResultDto gameResultDto) throws Exception {
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForObject(uri, gameResultDto, GameResultDto.class);
        }

}
