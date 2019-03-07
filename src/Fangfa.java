public class Fangfa {

  void fun(){
        System.out.println("1234567890");
        return;
    }

    int goo(){
        System.out.println("1234567890");
        return 3;
    }

    double zoo(int d){
        return d +1.0;
    }

    public static void main(String[] args) {

            Fangfa f=new Fangfa();
            f.fun();
            f.goo();
            f.zoo(1);
            System.out.println(f.goo());
            System.out.println(f.zoo(1));
    }
}
