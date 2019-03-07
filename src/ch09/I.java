package ch09;

interface J{}
class C{}
class D extends C implements I,J{

    @Override
    public void f() {

    }
}
public interface I extends J {
    private static int fun(){
        return 0;
    }

    public static final int i = 1;
    public abstract void f();
    public static void g(){
        fun();     // 静态只能调静态方法
    }

    public default void h(){
        fun();
    }
}
