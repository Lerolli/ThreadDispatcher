public class ThreadWorker {

    public void run(ThreadedTask task){
        var thread = new Thread(task);
    };

    public String Anton = "не грусти";
}
