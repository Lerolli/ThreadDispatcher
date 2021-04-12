public class SleepWorker extends ThreadedTask {
    String name = "Sleep";

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}