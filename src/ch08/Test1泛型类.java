package ch08;

import java.util.ArrayList;
import java.util.Arrays;

class Node<T,E>{
    private T date;
    public E num;
    private String name;

    public static <A,B> A f(){   //泛型方法
        A a =null;
        return a;
    }

}

public class Test1泛型类 {
    public static void main(String[] args) {
        //Node.<String>f(); //泛型方法
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int i = list.get(0);

        Node<Integer, Double> node = new Node<>();
        Node<String, String> node1 = new Node<>();
    }

}
