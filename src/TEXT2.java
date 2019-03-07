

public class TEXT2 {
    public static void main(String[] args) {
        /*var i=3;
        switch (i){
            case 1 :
                System.out.println(11);
                break;
            case 2 :
                System.out.println(22);
                break;
            case 3 :
                System.out.println(33);
                break;
            case 4 :
                System.out.println(44);
                break;
            default:
                System.out.println("other");
                break;
        }*/
        for (int i =0; i<3;++i)
            for(int j =0; j<3;++j)
                for (int k=0; k<3; ++k){
                    if (j==2) break;
                    System.out.println("hello");
        }
    }
}


