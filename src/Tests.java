
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Tests {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","10");

        System.out.println(properties.getProperty("name"));

        OutputStream out = new FileOutputStream("my.properties");
        properties.store(out,"This is a comment");


        //假设事先已经存在一个文件,如db文件
        Properties db = new Properties();
        db.load(new FileInputStream("db.properties"));
        db.forEach((k,v)-> System.out.println((k + "=" +v)));
    }
}
