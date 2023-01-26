
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//try-catch-finally
public class text1 {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            reader=new FileReader("d:/s.txt");
            char a=(char)reader.read();
            System.out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
