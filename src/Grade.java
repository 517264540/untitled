import java.util.Scanner;

public class Grade {
//    private int num=6;
//    private Student student;
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
//
//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//    public Grade(){
//        Student stu=new Student();
//        this.student=stu;
//        System.out.println("nums:"+this.num+"name:"+this.student.getName()+"age:"+this.student.getAge()+"numbers:"+this.student.getNumbers());
//
//    }


//    public static void main(String[] args) {
//        Demo tom = new Demo("tom",1000);
//
//        tom.setSalary(-1000);
//        System.out.println(tom.getSalary());
//    }


    public static void main(String[] args) {
        Demo tom = new Demo("tom", 1000);
        tom.pi = 100;
        System.out.println(tom.pi);

        Demo jerry = new Demo("jerry", 2000);
        System.out.println(jerry.pi);
        jerry.pi = 200;

        System.out.println(tom.pi);
    }
}