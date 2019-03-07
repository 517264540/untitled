package ch05;

public class T {

    void foo() {
    }

    void foo(int i) {
    }
    // 重载
    // 1.方法名必须相同，参数必须不同（顺序，类型，个数）
    // 注意与参数名无关，只与类型挂钩
    // 2.重载与返回值没有任何关系，可以相同或不同
    // 3。重载可以发生在单一类中，也可以发生在父子类中

    public static void main(String[] args) {
//        Employee e = new Manager();
//        ((Manager) e).getBonus();


        Employee e1 = new Employee();
        //为了不让程序在运行时出错
        if (e1 instanceof Manager)
            //（变量 instanceof 类名）
            e1.getHireDay();










    }
}


