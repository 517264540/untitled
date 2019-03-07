import java.util.*;

public class Dong {

    public static void main(String[] args) {

//        int [] nums ={5,1,9,7,5,3,0,5};
//        System.out.println(Arrays.toString(nums));
//
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));




       /* for (var i = 0; i < 20; i++)
        System.out.print(" "+
                (int) (Math.random()*21));*/



//       int [] array=new int[10];
//       Arrays.fill(array, 100);
//       System.out.println(Arrays.toString(array));




        int[] nums = {20,19,3,55,79,2,5,4,0};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, 55));


        int[] nums2 = {20,19,3,55,79,2,5,4,0};
        for (var i =0; i<nums2.length;i++ ) {
            if (4==nums2[i]) {
                System.out.println(i);
                break;
            }

        }

    }
}