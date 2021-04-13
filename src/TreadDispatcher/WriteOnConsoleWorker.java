package TreadDispatcher;

public class WriteOnConsoleWorker extends ThreadedTask {

    @Override
    public void start(){
        System.out.print("Что-то пишется в консоль \n");
    }

    @Override
    public String getName() {
        return "WriteOnConsole";
    }
}
