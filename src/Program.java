public class Program {
    public static void main(String[] args){

        var threadDispather = ThreadDispatcher.getInstance();
        var consoleTask = new WriteOnConsoleWorker();
        var sleepTask = new SleepWorker();
        var infinityWorker = new InfinityWorker();
        var thread1 = new Thread(infinityWorker);
        var thread2 = new Thread(consoleTask);
        threadDispather.Add(consoleTask);
        threadDispather.Add(consoleTask);
        threadDispather.Add(consoleTask);
        threadDispather.Add(sleepTask);
        threadDispather.AddInQueue(sleepTask);
    };
}
