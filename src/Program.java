import TreadDispatcher.CountWorker;
import TreadDispatcher.SleepWorker;
import TreadDispatcher.ThreadDispatcher;
import TreadDispatcher.WriteOnConsoleWorker;

public class Program {
    public static void main(String[] args){
        var threadDispatcher = ThreadDispatcher.getInstance();
        threadDispatcher.setMaxPoolSize(2);

        threadDispatcher.addInQueue(new CountWorker());
        threadDispatcher.addInQueue(new CountWorker());
        threadDispatcher.addInQueue(new CountWorker());

        threadDispatcher.addInQueue(new SleepWorker());
        threadDispatcher.addInQueue(new SleepWorker());
        threadDispatcher.addInQueue(new SleepWorker());

        threadDispatcher.addInQueue(new WriteOnConsoleWorker());
        threadDispatcher.addInQueue(new WriteOnConsoleWorker());
        threadDispatcher.addInQueue(new WriteOnConsoleWorker());
    };
}
