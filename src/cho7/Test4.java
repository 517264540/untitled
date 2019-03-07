package cho7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

public class Test4 {
    void f(int i , double d){
        //Lambda中使用的变量是不能被修改的
        //i=i+1;
        d=d+1;
        double j =1;
        Comparator comparator = (zz,yy) ->{
            System.out.println(i
            );
            return 0;
        };
    }






    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (o1,o2) -> {
            return o1 + o2;
        };

        BiPredicate<Integer,Double> biPredicate = (t,u) -> t > u;
        //Lambda简化:
        //参数只有一个时可以省略小括号
        //方法体只有一句时可以省略大括号


        IntToDoubleFunction f = (a) ->{
            return a+1;
        };

        DoubleBinaryOperator i = (o1, o2) ->{
            return o1+1;
        };














//        Integer [] nums = {1,4,7,2,3,6,8,};
//        Arrays.sort(nums,Integer::compare);
//        System.out.println(Arrays.toString(nums));
    }
}



 //System.out::println
//::后面的方法有几个参数,就要在替换为的Lambda中写几个参数 然后在方法体中将::变回
//(x) -> {System.out.println(x)}
