import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FlightService {
    //CompletableFuture since program is going to run async
    public CompletableFuture<Quote> getQuote(String site){
        return CompletableFuture.supplyAsync(() -> {
            //simulating calling a remote service
            System.out.println("Getting a quote from " + site);

            TaskDelay.simulate(1000);

            var random = new Random();
            var price = 1000 + random.nextInt(300);
            return new Quote(site, price);
        });
    }
}