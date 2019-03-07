package a.b.c.EmployeeTest;

import java.time.Instant;

public class Teat {

    public static void main(String[] args) {
        Person p1 = new Person(1,"tom");
        Person p2 = new Person(1,"Jerry");


        System.out.println(p1.toString());
        // 打印一个对象和打印一个对象的toString方法是一样的
        // toString就是Object中的方法，会输出"类名@哈希码"


        System.out.println(Integer.toHexString(p1.hashCode()));

        System.out.println(p2);
        System.out.println(Integer.toHexString(p2.hashCode()));


    }
}
