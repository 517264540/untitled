public class Test11 {
    int a =10;
    int foo(int i,String d){
        ++i;

        return i ;
    }
    void goo(String name){
        name+="oop";
        System.out.println(name);
        ++a;
    }
    String names(String name){
        name="san";
        return name;
    }

    public static void main(String[] args) {
        Test11 test11 = new Test11();

        String name = "zhang";
        test11.goo(name);



    }
}
