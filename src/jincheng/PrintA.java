package jincheng;

public class PrintA implements Runnable {
    @Override
    public void run() {
//        try {
//            for (int i =0; i<5; i++){
//                Thread.sleep(200);
//                //当前线程休眠XXX时间,单位是毫米.
//                //1秒=1000毫米
//                System.out.printf("%-3s","A");}
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }




//        for (int i = 0 ; i<5; i++){
//            Thread.yield();
//            //通知CPU该线程可以让出CPU给其他线程执行
//            System.out.printf("%-3s","A");
//        }



        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++){
                System.out.printf("%-3s","Z");
            }
        });
        thread.start();
        for (int i = 0; i < 5; i++){
            if (i == 2){
                try{
                    thread.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
            System.out.printf("%-3s","A");
        }  //只要5个Z打印完毕后,还剩下2个及其以上的A,结果都是对的
    }
}
