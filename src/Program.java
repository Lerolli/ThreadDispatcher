public class Program {
    public static void main(String[] args){

        var threadDispatcher = ThreadDispatcher.getInstance();
        var consoleTask = new WriteOnConsoleWorker();
        var sleepTask = new SleepWorker();
        var infinityWorker = new InfinityWorker();
        threadDispatcher.Add(consoleTask);
        threadDispatcher.Add(consoleTask);
        threadDispatcher.Add(consoleTask);
        threadDispatcher.Add(sleepTask);
        threadDispatcher.Add(infinityWorker);
        threadDispatcher.AddInQueue(sleepTask);
    };
}
