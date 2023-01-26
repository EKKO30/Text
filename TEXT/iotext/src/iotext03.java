import java.io.*;

public class iotext03 {
    //拷贝文件
    public static void method1(String path1,String path2)throws IOException {
        /*此写法可以不写close
        try(FileInputStream a1=new FileInputStream(path1);
            FileOutputStream b1=new FileOutputStream(path2);) {
            byte[] by = new byte[1024];
            int len;
            while ((len = a1.read(by)) != -1) {
                b1.write(by, 0, len);
            }
        }catch (IOException gh){
            gh.printStackTrace();
        }*/


        FileInputStream a1=new FileInputStream(path1);
        FileOutputStream b1=new FileOutputStream(path2);

        byte[] by=new byte[1024];
        int len;
        while((len=a1.read(by))!=-1){
            b1.write(by,0,len);
        }

        a1.close();
        b1.close();
    }
    //使用缓冲流拷贝文件，文件越大效果越明显
    public static void method2(String path1,String path2)throws IOException {

        FileInputStream a2=new FileInputStream(path1);
        FileOutputStream b2=new FileOutputStream(path2);

        BufferedInputStream c=new BufferedInputStream(a2);
        BufferedOutputStream d=new BufferedOutputStream(b2);
        int len;
        while((len=a2.read())!=-1){
            b2.write(len);
        }

        a2.close();
        b2.close();
    }

    public static void main(String[] args) {
        try{
            method2("F:\\s.txt","F:\\sdemo2.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
