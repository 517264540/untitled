package jincheng;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class Sum {
    private LongAdder i = new LongAdder();
    //private AtomicInteger i = new AtomicInteger(0);

    public void inc(){
        i.add(1);
        //i.getAndIncrement();
    }

    public int get(){
        return  i.intValue();
        //return i.get();
    }
}
