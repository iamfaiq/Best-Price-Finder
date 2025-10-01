public class TaskDelay {
    //for simulating a delay while a task completes.
    public static void simulate(int delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
