package cho7;
//为什么要用自己的异常？  因为Java中的异常可能没有包括我所运用的程序的异常，例如银行等
import java.io.IOException;
class MyException extends Throwable{
    public MyException(){                 //自己的异常
        super("余额不足");
    }

    public MyException(String s ){
        super(s);
    }
}




public class Test5异常 {


    int f(){
        try {
            return 0;
        }finally {
            return 1; //方法f最终返回的值是1,不是0
        }
        //throw new IndexOutOfBoundsException();
        //RuntimeException即其子类没有必要被声明或捕获

    }

    public static void main(String[] args) throws MyException {
            try {
                if (args.length == 0)
                throw new MyException("XXXX");  //抛异常
                //try中一旦发生异常,就会立刻停止之后的语句,转而执行catch
                System.out.println("hello1");
                //reture  //final还会执行
                System.exit(1);     // 程序立刻被终止  连final也不写
            }catch (MyException e){
                //catch参数捕获的异常类型必须是抛出异常本身或父类
                e.printStackTrace(); //可以不写 这行  说明错误
                System.out.println("hello2");
            }catch (Throwable e){
                //catch可以有多个,，但是最下面的应该是类型最宽泛的
                System.out.println("hello3");
            }finally {
                System.out.println("*****");
                //无论是否产生异常,finally里面的内容必须执行
            }

            //这里调用f 运行会报错
        //一旦程序发生异常就不再继续执行了
        System.out.println( );


    }
}
