/*package cho7;

import java.util.Arrays;

//Comparable接口用于指定对象排序的方法
//对象如果需要排序，比较等操作，必须实现该接口
public class User1 implements Comparable<User> {
    private int id;
    private String name;

    public User1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
       // return 0;    //reture -1 表示当前对象比0小
                     //reture  0 表示两个对象相等
                     //reture  1 表示当前对象比0大
//        if (this.id > o.id())  return 1 ;
//        else if (this.id == o.id()) return 0;
//        else return -1;
        if (this.name.charAt(0) > o.name)
    }
}
*/