package ch05;

public class Zi extends Fu{

    private String zi;
    // 建议：子类构造器的参数要想办法给父类中的属性一个值

    public Zi() {
        super(); // 子类构造器中如果没有用this()来调本类的其余构造器
        // 就会自动被加入super(); 这句话的意思是调用父类无参数构造器
        // super()必须出现在构造器的第一行
        System.out.println("Zi: "+zi);
    }

    public Zi(String zi, String f) {
        super(f);  // 调用父类一个代String参数的构造器
        this.zi = zi;
        System.out.println("Zi: "+zi);
    }

    @Override
    public String toString() {
        return "Zi{" +
                "zi='" + zi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Zi zi = new Zi("abc","def");
        System.out.println(zi);
     


    }
}
