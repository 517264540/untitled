package cho7;

import java.time.LocalDate;

public class User implements Cloneable{
    //如果需要克隆，必须需要实现这个接口
    //如果一个接口中没有任何方法，在这个接口被认为是一个标记性接口
    private int id;
    private String name;
    private LocalDate birthday;

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();    浅拷贝
        User user = (User) super.clone();

        LocalDate localDate = LocalDate.of(
                birthday.getYear(),
                birthday.getMonthValue(),
                birthday.getDayOfMonth()
                );
        user.birthday = localDate;
        return user;
    }


    public User(int id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
