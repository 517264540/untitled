public class Test{
    int foo(){
        System.out.println("foo");
        return 1;

    }

    void goo(){
        System.out.println("foo");
    }

    public static void main(String[] args) {
        Test test = new Test();


        System.out.println(test.foo());


    }
}