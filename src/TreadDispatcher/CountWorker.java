package TreadDispatcher;

public class CountWorker extends ThreadedTask {

    String name = "InfinityWorker";

    @Override
    public void start() {
        var i = 0;
        while (i < 1000000) {
            i++;
        }
    }

    @Override
    public String getName(){
        return "Infinity Worker";
    }
}
