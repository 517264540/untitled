package a.b.c.EmployeeTest;

import java.util.Objects;

public class Person {
//
//    public Person(){}  //抽象类能有构造器 作用是给子类调用
//
//    public  void foo(){};       // 1.一个类中如果有抽象方法，这个类就必须是抽象类
//                                // 2.抽象方法没有方法体，即没有{}
//                                // 3.抽象方法必须在子类中被覆盖，如果不覆盖，那么子类必须也被标记为抽象类
//                                // 4.父类的方法是普通方法，子类可以对其覆盖，甚至可以将其覆盖成抽象的
//
//
//    public static void main(String[] args) {

//        Person person = new Person();







    public int i;
    public String name;

    public Person(int i, String name) {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return i == person.i &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, name);
    }
}

