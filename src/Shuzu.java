import java.util.Arrays;

public class Shuzu {
    public static void main(String[] args) {
        int [] number1 = {1,2,3};
        boolean [] result = {true ,false,true,false,false};
        String [] strs = {"hello","cat","world","dog","sky"};
        double [] score = {11.1,22.2,33.3,44.4};

        for (var i = 0; i<=4;i++)
            System.out.println(strs[i]);
        for (var i = 0; i<strs.length; i++)
            System.out.println(strs[i]);

        Arrays.stream(strs).forEach(System.out::println);
        Arrays.stream(strs).forEach(w->System.out.printf("%-10s",w));
        //lambda biaodashi

       System.out.println(strs[0]);


        String [] number2 = new String[10];
        System.out.println(number2[2]);




        int [] number3 =new int[]{1,2,3,4,5};
        System.out.println(number3[4]);
    }
}
