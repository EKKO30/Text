import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class iotext02 {
    public static void method1(String path) throws IOException {

        FileOutputStream b2=new FileOutputStream(path);
        byte[] bt="java".getBytes();
        b2.write(bt);
        b2.close();
    }

    public static void main(String[] args) {
        try{
            method1("F:\\output.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
