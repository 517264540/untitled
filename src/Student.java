public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private int numbers;

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Student(String name,int age,int numbers){
        this.name=name;
        this.age=age;
        this.numbers=numbers;
        System.out.println("name:"+this.name+"age:"+this.age+"numbers:"+numbers);

    }

    public  Student(){
        System.out.println("name:"+name+"age:"+age+"numbers:"+numbers);

    }
}
