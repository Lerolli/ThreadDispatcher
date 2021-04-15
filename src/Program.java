import TreadDispatcher.CountWorker;
import TreadDispatcher.SleepWorker;
import TreadDispatcher.ThreadDispatcher;
import TreadDispatcher.WriteOnConsoleWorker;

public class Program {
    public static void main(String[] args){
        var threadDispatcher = ThreadDispatcher.getInstance();
        threadDispatcher.setMaxPoolSize(1);

        threadDispatcher.addInQueue(new CountWorker());


        threadDispatcher.addInQueue(new WriteOnConsoleWorker());

        threadDispatcher.addInQueue(new SleepWorker());

    };
}
