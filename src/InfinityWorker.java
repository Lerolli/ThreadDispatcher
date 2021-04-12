public class InfinityWorker extends ThreadedTask {

    @Override
    public void run(){
        var flag = true;
        while (true){
            flag = !flag;
        }
    }
}
