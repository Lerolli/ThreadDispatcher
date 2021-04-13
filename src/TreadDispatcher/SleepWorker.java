package TreadDispatcher;

public class SleepWorker extends ThreadedTask {

    @Override
    public void start() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return "SleepWorker";
    }
}