package myframegame;

import java.awt.*;

//游戏物体根类
public class GameObject {
    Image img;
    int x,y;
    int speed;
    int width,high;

    public void drawMySelf(Graphics g){
        g.drawImage(img,x,y,width,high,null);
    }

    //返回该物体对应的矩形
    public Rectangle geiRec(){
        return new Rectangle(x,y,width,high);
    }

    public GameObject(){}

    public GameObject(Image img, int x, int y, int speed, int width, int high) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.high = high;
    }

    public GameObject(Image img) {
        this.img = img;
        if(this.img!=null){
            this.high= img.getHeight(null);
            this.width= img.getWidth(null);
        }
    }

    public GameObject(Image img, int x, int y) {
        this(img);
        this.x = x;
        this.y = y;
    }

    public GameObject(Image img, int x, int y, int speed) {
        this(img,x,y);
        this.speed = speed;

    }


}
