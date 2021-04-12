public class WriteOnConsoleWorker extends ThreadedTask {
    String name = "Write on console";

    @Override
    public void run(){
        System.out.print("Что-то пишется в консоль");
    }
}
