package rs.ivan.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;
import rs.ivan.model.Ticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;
import rs.ivan.repository.TickerRepository;

@Controller
public class TickerController {

    @Autowired
    private TickerRepository tickerRepository;

    @GetMapping("/")
    public Mono<String> index() {
        return Mono.just("home");
    }

    @GetMapping(value = "/tickers", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    public Flux<Ticker> tickers(){
        return tickerRepository.findWithTailableCursorBy();
    }
}
