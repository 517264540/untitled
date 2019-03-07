import java.util.Arrays;
public class Test33 {
    void foo(int [] nums){
        for (int i = 0; i <nums.length; i++)
            nums[i]++;
//        nums = new int[]{2,3,4};
//        System.out.println("in foo: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Test33 t = new Test33();
        int [] nums = {1,2,3};
        t.foo(nums);
        System.out.println("in main: " + Arrays.toString(nums) );
    }
}   
