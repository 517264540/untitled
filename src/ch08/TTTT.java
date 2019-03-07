package ch08;
class ArrayAlg{
    public static <T> T getMiddle(T...a){
        return a[a.length / 2];
    }
}



public class TTTT {
    public static void main(String[] args) {
      String s =  ArrayAlg.<String> getMiddle("String");
        System.out.println("s");
      Integer i = ArrayAlg.<Integer> getMiddle(1,5,8,99,75,45);
        System.out.println("i");
    }

}
