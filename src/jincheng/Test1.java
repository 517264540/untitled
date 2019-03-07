package jincheng;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

//安全线程   14.7
public class Test1 {
    public static void main(String[] args) throws InterruptedException  {
        //ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();  // 老式集合
        ConcurrentHashMap<String, LongAdder> concurrentHashMap = new ConcurrentHashMap<>();
        //concurrentHashMap.put("Tom",0);
        concurrentHashMap.put("Tom",new LongAdder());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable r = () ->{
          //  concurrentHashMap.put("Tom",concurrentHashMap.get("Tom")+1);
          concurrentHashMap.putIfAbsent("Tom",new LongAdder()).increment();
        };

        for (int i = 0; i < 10000; i++){
            executorService.execute(r);
        }

        Thread.sleep(300);
        executorService.shutdown();

        System.out.println(concurrentHashMap.get("Tom"));


    }
}
