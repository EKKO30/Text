import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class iotext05 {
    public static void method(String path) throws IOException {

        FileOutputStream g=new FileOutputStream(path);
        String a="xikuafiou124234";

        byte[] s=a.getBytes();
        g.write(s);

        g.close();
    }

    public static void main(String[] args) throws IOException {
        method("F:\\output12.txt");
    }
}
