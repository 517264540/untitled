package cho7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Users implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getId() > o2.getId())
            return 1;
        else if (o1.getId() == o2.getId())
            return 0;
        else return -1;

    }

    public static void main(String[] args) {
        User tom = new User(1, "tom", LocalDate.now());
        User jerry = new User(3, "jerry", LocalDate.now());
        User ben = new User(2, "ben", LocalDate.now());

        User[] users = {tom, jerry, ben};
        Arrays.sort(users, new Users());
        Arrays.stream(users).forEach(System.out::println);
    }
}


