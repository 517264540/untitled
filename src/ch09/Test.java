package ch09;

import java.security.Key;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        //TreeMap是按照Key有序来排序的
        //LinkedHashMap是按照插入顺序有序的
        //HashMap是无序的
        map.put("tom",10); // tom是键, 10是值
        map.put("jerry",3);
        map.put("ben",9);
        map.put("tom",5);
        System.out.println(map.get("tom"));
        System.out.println(map.get("jerry"));
        //Map(映射)的key键是不允许重复元素的,值是最后一次放入键盘所对应的
        //Map的key键虽然不允许重复,但值却是允许重复的
        //Set中的元素也是不允许重复的


        java.util.Set<String> keys= map.keySet();
        //KeySet方法是将Map中所有的键取出来组成一个Set
        //但这个Set并不是java.util.Set, 而是class KeySet
        //KeySet实际上实现了Set接口,但是其中大部分方法都是抛异常的

        Set<String> keys1 = new HashSet<>(keys);
            //for(String key : keys)
                // keys1.add(key);
        keys1.add("sss");
        //将一个List集合中的重复元素去掉.
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(1); list.add(1);
        Set<String> keys2 = new HashSet(list);
        keys2.forEach(System.out::println);


        for (String key : map.keySet()){
            System.out.printf("%-5s: %-3d", key, map.get(key));
        }
        System.out.println();


        map.forEach((k, v)->System.out.printf("%-5s: %-3d", k, v));
    }
}
