package ch06;

interface B{
    default void foo(){
        System.out.println("b");
    }
}

interface C{
    default  void  foo(){
        System.out.println("c");
    }
}
 class Test12 {
    public void foo(){
        System.out.println("test12");
    }
}

//public class Test11 extends Test12 implements C,B{
//
//}
