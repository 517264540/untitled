package cho7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException {
      /*  User tom = new User(1,"tom", LocalDate.now());

        User tomClone = (User)tom.clone();

        System.out.println("tom: " + tom);
        System.out.println("tom Clone:" + tomClone);
        System.out.println(tom == tomClone);
        System.out.println(tom.getBirthday() == tomClone.getBirthday());

        //浅拷贝/克隆只拷贝了基本类型，对于引用类型依然是公共的
        //深拷贝/克隆要对每一个类型都进行拷贝，达到两个对象的每个部分都完全被克隆
        //如何进行深拷贝/克隆？  先进行浅拷贝，即super.clone()，在对每一个引用类型单独拷贝*/










        //java是00P，但是很多时候我们只需要给方法传递一些语句
        //以往的做法是将这些语句封装在一个对象的方法中,然后传递这个对象
        //但是Java 8 之后,将这些语句放在了一个叫做Lambda的类型中
        //Lambda也可以看作一种类型,所以也可以用来作为参数传递给方法,
        //这样既解决了传递语句的问题,也不用破坏Java面向对象的特种

        User [] users = {
              //
                //         new User(3,"tom",LocalDate.of(1999,1,1))
        };

        Comparator<User> userSort = (o1, o2) -> {
            if (o1.getId() > o2.getId()) return 1;
            else if (o1.getId() == o2.getId()) return 0;
            else return -1;
        };



        Runnable runnable = () -> {};

        Supplier supplier = () -> 0;

        Consumer consumer = (o) -> {};

        Runnable r =() ->{};
        //Java中两大类型；
        //1 引用类型:类类型，数组类型，Lambda类型
        //2 基本类型: 8个
        int i = 1;


        //lambda的语法:()->{  }
        //lambda本质上就是一个方法, （）是方法的参数, { }内是方法体
        //有时lambda本质上是方法,而方法的参数类型已经确定,所以{ }内的参数不需要类型

        Arrays.sort(users,userSort);















        Lambda lambda = (num1,num2)-> {
            System.out.println(num1 + num2);
            return 0;
        };
        //lambda表达式其实就是一个方法,
        //接受这个表达式的必须是一个函数式接口 （仅包含一个抽象方法的接口）
        //所有的函数式接口都可以存放Lambda表达式
    }
}


