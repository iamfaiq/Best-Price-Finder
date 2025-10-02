import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var start = LocalTime.now();
        var service = new FlightService();
        //list of completablefuture of void
        var futures = service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start, end);
                    System.out.println();
                    System.out.println("Retrieved all quotes in "+duration.toMillis()+" msec.");
                });

        //5 seconds delay to allow the completion of above program
        TaskDelay.simulate(5_000);
    }
}