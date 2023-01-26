package myframegame;
import javax.imageio.ImageIO;
import java.awt.*;
import  java.io.IOException;
import java.net.URL;
//工具类
public class Gameutil {
    public static  final int Frame_Width=500;
    public static  final int Frame_High=500;

    //构造器私有，防止外部创建对象
    private Gameutil(){}

    public  static Image getImage(String path){
        Image img=null;
        URL url=Gameutil.class.getClassLoader().getResource(path);
        try{
            img= ImageIO.read(url);
        }catch (IOException e){
            e.printStackTrace();
        }
        return img;
    }
}
