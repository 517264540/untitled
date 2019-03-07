package cho7;

public class TTTT {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for(int j = 1; j < 4; j++) {
                if( i * j > 2)
                    break;
                System.out.println("#");
            }
            System.out.println("*");
        }
    }
}
