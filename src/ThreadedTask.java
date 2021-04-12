import java.util.ArrayDeque;

public class ThreadedTask implements Runnable{

    public static ArrayDeque<ThreadedTask> activeTasks = new ArrayDeque<>();
    private synchronized void updateActiveTasks() {
        activeTasks = ThreadDispatcher.queue.clone();
    }

    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println("Error in ThreadMonitor");
            }
            System.out.println(activeTasks);
            updateActiveTasks();
        }
    };
}
