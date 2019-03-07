package ch06;


import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {

        Class cl = User.class;     //折射的写法
        Method[] methods = cl.getMethods();
        //拿到当前类和父类中public的方法

        for (int i = 0; i < methods.length; i++)
            System.out.println(methods[i]);

        System.out.println("------------------------");

        methods = cl.getDeclaredMethods();
        for (Method method : methods)
            System.out.println(method);






    }
}
