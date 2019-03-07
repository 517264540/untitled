
public class Demo{
    private String name;
    private double salary;
    public static double pi;


    {
        name="tom";
        salary=2.1;
    }

    public Demo(String name,double salary){
        this.name="ttt";
        this.salary=2.22;
    }


    public Demo(){
        name="ben";
        salary=3.3;
    }



//    static {                               //youxian
//        System.out.println("static2");
//    }
//    static {
//        System.out.println("static1");
//    }


    @Override
    public String toString() {
        return "["+name+","+salary+"]";
    }


//    int fun(int i){            //fangfa
//        return 0;
//    }
//
//    void Demo(){
//
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Demo getTom() {
        return tom;
    }

    public void setTom(Demo tom) {
        this.tom = tom;
    }

    public Demo getJerry() {
        return jerry;
    }

    public void setJerry(Demo jerry) {
        this.jerry = jerry;
    }

    public static void main(String[] args) {
//        Demo demo = new Demo("iii",2.2);
//        System.out.println(demo.name);
//        System.out.println(demo.salary);
//
//        int i=1;
//        System.out.println(i);
    }

    Demo tom=new Demo("tom",100);
    Demo jerry=new Demo("tom",1000);


}
