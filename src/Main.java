import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var service = new FlightService();
        //this returns a completable future
        service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        //5 seconds delay to allow the completion of above program
        TaskDelay.simulate(5_000);
    }
}