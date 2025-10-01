import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    public Stream<CompletableFuture<Quote>> getQuotes(){
        var sites = List.of("siteA", "siteB","siteC");
        return sites.stream()
                .map(this::getQuote);
    }
    //CompletableFuture since program is going to run async
    public CompletableFuture<Quote> getQuote(String site){
        return CompletableFuture.supplyAsync(() -> {
            //simulating calling a remote service
            System.out.println("Getting a quote from " + site);

            var random = new Random();
            TaskDelay.simulate(1_000 + random.nextInt(2_000));
            var price = 1_000 + random.nextInt(300);
            return new Quote(site, price);
        });
    }
}