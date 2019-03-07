package ch08;


import java.time.LocalDate;
import java.util.ArrayList;


public class PairTest2 {
    public static void main(String[] args) {
        class Employee { }

        // Pair<Number> num = new Pair<Integer>();     错误写法

        //类型限定:自定义泛型类,自定义泛型方法                                                      //1
        class User<T extends Cloneable>{}

        //通配泛型:通配泛型一定带?
        Pair<? extends Number> num1 = new Pair<Integer>();
        //<子类 extends 父类>

        Pair<? super Number> num3 = new Pair<Object>();
        //<父类 super 子类>

        Pair<?> num4 = new Pair<LocalDate>();                        //1.




        Number number = new Integer(1);
        ArrayList list1 = new ArrayList<Employee>();
        ArrayList list2 = new ArrayList<Number>();

    }
}
