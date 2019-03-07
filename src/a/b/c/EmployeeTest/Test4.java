package a.b.c.EmployeeTest;

// 参数可变的方法
// 可变参数相当于一个数组
// 一个方法只能有一个可变参数
// 可变参数必须在参数列表的最后

public class Test4 {

    void foo(int i,double... d){
        System.out.print(i +" ");
        for (int j=0; j<d.length; j++)
            System.out.printf("%-3f",d[j]);
    }


    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.foo(1);
        System.out.println("\n==========\n");
        test4.foo(1,2,3,4,5,6);
    }
}
