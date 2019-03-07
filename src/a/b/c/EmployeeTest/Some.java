package a.b.c.EmployeeTest;

public class Some extends Something {

    void foo(){
        System.out.println(super.i);
        System.out.println(super.j);
    }

    public static void main(String[] args) {
        Some some = new Some();
        some.foo();

    }
}
