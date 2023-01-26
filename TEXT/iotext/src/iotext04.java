import java.io.*;


public class iotext04 {
    //字符流+缓冲流
    public static void method(String path1,String path2) throws IOException {
        FileReader reader=new FileReader(path1);
        FileWriter writer=new FileWriter(path2);

        BufferedReader a=new BufferedReader(reader);
        BufferedWriter b=new BufferedWriter(writer);

        int ad=0;
        //也可以创建数组char[]
        while((ad=reader.read())!=-1){
            writer.write((char)ad);
            //刷新缓存，防止缓存中数据还没输出流就已经关闭
            writer.flush();
        }

        reader.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        method("F:\\s.txt","F:\\sdemo2.txt");
    }
}
