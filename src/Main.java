//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var service = new FlightService();
        //this returns a completable future
        service.getQuote("Site A").thenAccept(System.out::println);

        //3 seconds delay to allow the completion of above program
        TaskDelay.simulate(3000);
    }
}