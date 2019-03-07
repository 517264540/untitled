import java.time.Instant;
import java.time.LocalDate;

public class Erweishuzu {
    public static void main(String[] args) {
//        int [] [] nums1={
//                {1,2,3,},
//                {4,5,6,},
//                {7,8,9,},
//        };
//        for (var i=0; i<3;i++){
//            for(var j =0;j<3; j++){
//                System.out.printf("%-3d",nums1[i] [j]);
//            }
//            System.out.println();
//        }



//        int [] [] nums2={
//                {1,2,3,4,5,6,},
//                {2,3,4,},
//                {5,6,7,8,9,},
//        };        for(var a =0; a<nums2.length;a++){
//            for (var b=0; b<nums2[a].length;b++){
//                System.out.printf("%-3d",nums2[a][b]);
//            }
//            System.out.println();
//
//        }


          //qiu  pingfang    jueduizhi   kaipingfang!!
//        System.out.println(Math.pow(2,3.5));
//        System.out.println(Math.abs(-5555));
//        System.out.println(Math.sqrt(555);



        //qiu  shi  jian
        Instant now = Instant.now();
        System.out.println(now);


        LocalDate date = LocalDate.now();
        System.out.println(date);

        long timestamp = System.currentTimeMillis(); // shijian chuo
        System.out.println(timestamp);

        System.out.println(timestamp / 1000 % 60);
        System.out.println(timestamp / 1000 / 60 % 60);
        System.out.println(timestamp / 1000 / 60 / 60 % 24);



     }
}
