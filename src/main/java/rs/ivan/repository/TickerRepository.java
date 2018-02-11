package rs.ivan.repository;

import rs.ivan.model.Ticker;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TickerRepository extends ReactiveCrudRepository<Ticker, String> {

    @Tailable
    Flux<Ticker> findWithTailableCursorBy();
}
