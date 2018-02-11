package rs.ivan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import rs.ivan.model.Ticker;
import rs.ivan.repository.TickerRepository;

@Component
public class ScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Autowired
    private TickerRepository tickerRepository;

    @Scheduled(fixedRate = 1000*60)
    public void insertNewBitcoinValue() {
        Ticker ticker = WebClient.create("https://api.coinmarketcap.com")
                .get()
                .uri("/v1/ticker/bitcoin/")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToFlux(Ticker.class).blockFirst();

        tickerRepository.save(ticker).block();
        log.info(ticker.getLastUpdatedTimestamp().toString());
    }
}
