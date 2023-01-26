import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class iotext01 {
    public static void method1(String path) throws IOException {

        FileInputStream a1=new FileInputStream(path);
        int len;
        while((len=a1.read())!=-1){
            System.out.println((char)len);
        }
        a1.close();
    }
    //提高效率
    public static void method2(String path) throws IOException {
        FileInputStream a2=new FileInputStream(path);
        byte[] bt=new byte[1024];
        int len;
        len=a2.read(bt);
        for(int i=0;i<len;i++){
            System.out.println((char)bt[i]);
        }
        a2.close();
    }
    public static void method3(String path) throws IOException {
        FileInputStream a3 = new FileInputStream(path);
        byte[] bt = new byte[1024];
        int len;
        int start=3,x=3;
        len = a3.read(bt,start,x);
        //start意识是从bt[start]开始写入数据，x是写入多少个数据
        for (int i=start; i < start+x; i++) {
            System.out.println((char) bt[i]);
        }
        a3.close();
    }

    public static void main(String[] args){
        try{
            method3("F:\\s.txt");
        }catch(IOException e){
            System.out.println("错误捕获完毕");
            e.printStackTrace();
        }
    }

}
