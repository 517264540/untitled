package cho7;

import org.junit.Test;

import static org.junit.Assert.*;

public class UUserTest { // jUnit类名不应该只叫Test

    @Test   //每一次作测试的时候都需要加入Test注解
    public void test1(){  //方法名任意,返回值应该是void,且不能带参数
        UUser tom = new UUser(1,"Tom");
        System.out.println(tom);
    }

    @Test
    public void test2(){
        UUser jerry = new UUser(2,"Jerry");
        System.out.println(jerry);
    }

} //直接在文件上点击右键执行,会依次执行这些带@Test的方法
 //也可以在某个方法名上点击右键,只执行这个方法