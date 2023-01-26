package myframegame;

import java.awt.*;
//飞机类
public class Plane extends GameObject{
    boolean left=true;
    @Override
    public void drawMySelf(Graphics g) {
        super.drawMySelf(g);
        if(left){
            x-=speed;
        }else{
            x+=speed;
        }

        if (x > 500) {
            left=true;
        }
        if(x<0){
            left=false;
        }
    }
    public Plane(Image img, int x, int y, int speed, int width, int high) {
        super(img, x, y, speed, width, high);
    }
}