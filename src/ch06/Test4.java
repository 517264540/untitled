package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        //用反射创建数组
        Object array = Array.newInstance(int.class,     10);

        int[] newArray = (int[])array;

        System.out.println(Arrays.toString(newArray));
    }
}



