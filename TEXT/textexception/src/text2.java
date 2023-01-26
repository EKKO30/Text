import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//throws外部抛出
public class text2 {

        public static void main(String[] args) throws IOException {
            FileReader reader=null;
            try {
                reader=new FileReader("d:/s.txt");
                char a=(char)reader.read();
                char a1=(char)reader.read();
                char a2=(char)reader.read();
                System.out.println(a);
            } finally{
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}
