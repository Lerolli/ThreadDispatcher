import java.util.ArrayDeque;

public class ThreadDispatcher {
    public static final ArrayDeque<ThreadedTask> queue = new ArrayDeque<>();
    private static volatile ThreadDispatcher instance;
    ThreadMonitor threadMonitor;
    ThreadWorker[] arrayThread;

    public ThreadDispatcher(){
        threadMonitor = new ThreadMonitor();
        Add(threadMonitor);

    }
    public static ThreadDispatcher getInstance() {
        if (instance == null) {
            synchronized (ThreadDispatcher.class) {
                if (instance == null) {
                    instance = new ThreadDispatcher();
                }
            }
        }
        return instance;
    }

    public void Add(ThreadedTask task){
        queue.push(task);
    }

    public void AddInQueue(ThreadedTask task){
        queue.addLast(task);
    }

    void setMaxPoolSize(int maxSize){
        arrayThread = new ThreadWorker[maxSize];
    }
}
