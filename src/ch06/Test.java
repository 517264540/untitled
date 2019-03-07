package ch06;

import java.lang.reflect.Constructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class cl = User.class;     //折射的写法
//       Field[] fields = cl.getFields(); //拿到所有属性  加了S后面
        //System.out.println(Arrays.toString(fields));

//        for (int i = 0; i < fields.length; i++)
//            System.out.println(fields[i]);
//
//        System.out.println("------------------------");
//
//        fields = cl.getDeclaredFields();
        //拿到当前类型中的public和private方法
//        for (Field field : fields)
//            System.out.println(field);






//fanshe
//        User tom = new User();
//        User jerry = new User();
//
//        Field id = cl.getField("id");
//        id.set(tom,1);
//        id.set(jerry,2);
//
//        Field name = cl.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(tom,"tom");
//        name.set(jerry,"jerry");
//
//        System.out.println(tom+"\n"+jerry);






   //调用方法  需要在user方法里输出一个语句   如果是有参就要方法中写出
        User user = new User();

        Method goo = cl.getDeclaredMethod("goo"); //如果是有参的 括号内写为（name： "goo",int.class, double.class）;
        goo.setAccessible(true);
        goo.invoke(user); //如果是有参的 括号内写为（user,  1, 3.14（赋值）);

        Method foo = cl.getMethod("foo");
        foo.invoke(user);





   //构造器

        Constructor constructorNoargs = cl.getConstructor();
        User user1 = (User) constructorNoargs.newInstance();
        //new一个新对象工厂方法
        System.out.println(user);



        Constructor constructor = cl.getConstructor(String.class, int.class, int.class);
        user = (User)constructor.newInstance("tom",1,1);
        System.out.println(user);
    }
}



//反射的作用： 分析一个类的能力