package jincheng;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class XXX {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();  //线程集合

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10); //延迟线程池

        Runnable r =() ->{
            concurrentHashMap.merge("Tom",1,Integer::sum);
            executorService.shutdown();

            try {
                Thread.sleep(4000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        System.out.println(concurrentHashMap.get("Tom"));
    }
}




