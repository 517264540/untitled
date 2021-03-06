package ch09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAndArray {
    //数组和集合的互相转换
    public static void main(String[] args) {
        Integer [] arr = {1,3,2,4,6,7,8};

        List<Integer> list = Arrays.asList(arr); //asList将数组转集合
        //list也是一个假的集合,只是一个视图(只能看不能改)
        list.forEach(e ->System.out.printf("%-3d",e));
        //list.add(9); 抛出异常

        System.out.println();

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(9);
        list1.forEach(e -> System.out.printf("%-3d",e));

        System.out.println();



        //--------------------------------------------------------------------
        Object[] arr1 = list1.toArray();//toArray将集合转为数组
        Arrays.stream(arr1).forEach(e -> System.out.printf("%-3d",e));


        Integer[] arr2 = list1.toArray(new Integer[0]); //toArray将集合转为数组
        Arrays.stream(arr2).forEach(e -> System.out.printf("%-3d",e));

        list1.subList(1,3).forEach(e ->System.out.printf("%-3d",e));
        //subList(m,n)取数组下标从第m个到第n-1个元素,
        //生成一个新集合,但是这个新集合也是假的,不能被修改

        List<Integer> list2 = Collections.unmodifiableList(list1);
        //生成一个不能被修改的只读的集合


    }
}
