package ch08;

import java.util.Comparator;



class ArrayAly{
    public static <T extends Comparable> T min(T[] a){
        if (a == null || a.length == 0)
            return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++)
            if (smallest.compareTo(a[i]) > 0)
                smallest = a[i];
            return smallest;
    }
}
public class TTTT2 {
    public static void main(String[] args) {
        ArrayAlg.<String>getMiddle(new String[]{"a","b"});
        class User implements Comparable<User>{
            @Override
            public int compareTo(User o){
                return 0;
            }
        }
        ArrayAlg.<User>getMiddle(new User[]{});
    }
}
