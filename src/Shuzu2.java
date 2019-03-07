import java.util.Arrays;

public class Shuzu2 {
    public static void main(String[] args) {

        int [] num1 = {1,2,3,4,};
        int [] num2 = Arrays.copyOf(num1, 2);
        int [] num3 = Arrays.copyOf(num1, 10);
        int [] num4 = Arrays.copyOf(num1, 4);

        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(num4));

        int [] num5 ={1,2,3,4,};
        int [] num6 = num5;
        System.out.println();



    }
}
