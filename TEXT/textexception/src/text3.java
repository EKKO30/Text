import java.io.FileNotFoundException;
import java.io.FileReader;
//try-with-resource
public class text3 {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("d:/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
