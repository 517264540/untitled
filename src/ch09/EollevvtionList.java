package ch09;

import java.awt.desktop.QuitEvent;
import java.util.*;

public class EollevvtionList {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("bcd");
//
//        list.forEach(System.out::println); //lambda表达式遍历集合
//
//        for (String s : list)
//            System.out.println(s); // forreache循环遍历集合
//
//
//        Iterator<String> iterator = list.iterator();
//        // 取到一个集合上的迭代器,迭代器用于遍历(循环)集合
//        while (iterator.hasNext()) //hasnext 尝试跨越一个元素,能跨越则返回true,否则返回false
//            System.out.println(iterator.next()); //将刚刚被跨越的元素取出 (返回)
//        //foreach循环在后台实际上就是用迭代器来完成的
//
//
//
//        //set集合
//        Set<Integer> set = new LinkedHashSet<>();   // LinkedHashSet(无序 1 3 5 8)可以换成 HashSet   TreSet(有序 1 2 3 4)
//        set.add(1);set.add(2);set.add(1);set.add(1);
//        set.add(5);set.add(3);set.add(9);set.add(4);
//        set.forEach(System.out::println);



        //Queue
        Queue<Integer> queue = new ArrayDeque<>(); //双端队列
                                   // PriorityQueue  优先级队列
        queue.offer(55); //元素放入队列(入队列)
        queue.offer(44); queue.offer(33);
        System.out.println(queue.peek());
        //查看队列的第一个元素(不取出)
        System.out.println(queue.poll());
        //查看队列的第一个元素(出队列)
        queue.forEach(System.out::println);



        //栈  后进先出
        Stack<Integer> stack = new Stack<>();
        stack.push(3); //将元素压入堆栈 (入栈)
        stack.push(5); stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop()); //将栈元素弹出堆栈(弹栈,出栈)
    }
}
