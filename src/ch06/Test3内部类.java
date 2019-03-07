package ch06;

import java.util.Arrays;
import java.util.Comparator;

class Outer {
    public void f() { }
    private int i =1;
    //静态内部类和嵌套内部类的用法：
    //这两种嵌套的做法都是为了将内部类隐藏,使得外部类以外的类无法直接使用他们
    //但是当内部类要访问外部类的成员和方法时,就用嵌套内部类
    //当不想让内部类访问外部类的成员和方法时,就用静态内部类


    public class Test3内部类 {
        public void g(){
            //内部类访问外部类的内容,用外部类名.this.
            Outer.this.f();
            Outer.this.i++;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Test3内部类 test3内部类 = outer.new Test3内部类();
        //创建内部类的对象
    }
}

//内部类生成class文件后,文件名称是外部类$内部类