package jincheng;
//Callable 接口




import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class sum implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 1;
    }
}


public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new sum());
        new Thread(task).start();
        try {
            System.out.println(task.isDone());
            System.out.println(task.get());
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }

}
