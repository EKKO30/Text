package myframegame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static myframegame.Gameutil.*;
import myframegame.GameObject.*;
public class myframegame extends Frame {
    Image bg=Gameutil.getImage("images/bg.jpg");
    Image plane=Gameutil.getImage("images/plane.jpg");

    Plane a=new Plane(plane,200,200,3,20,20);

    public void paint(Graphics g){
        /*Color old=g.getColor();
        g.setColor(Color.BLUE);//g.setColor(new Color(0,0,255))效果相同，分别对应红，绿，蓝
        g.drawLine(100,100,200,200);//以窗口左上角为原点
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.setColor(old);*/
        g.drawImage(bg,0,0,Frame_Width,Frame_High,null);
       // g.drawImage(plane,200,200,20,20,null);
        a.drawMySelf(g);

    }

    //初始化窗口
    public void LanunchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);//窗口默认不可见，让他可见
        this.setSize(Frame_Width,Frame_High);//窗口尺寸
        this.setLocation(300,300);//距离原点（电脑左上角）距离


        //增加关闭窗口的方法
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //启动窗口绘制线程
        new PaintThread().start();

    }
    //重画线程
    class PaintThread extends  Thread{
        public void run(){
            while(true){
                repaint();
                try {
                    Thread.sleep(40);//1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        myframegame frame=new myframegame();
        frame.LanunchFrame();
    }

    private Image offScreenImage=null;

    public void update(Graphics g){
        if(offScreenImage==null)
            offScreenImage=this.createImage(Frame_Width,Frame_High);
        Graphics goff=offScreenImage.getGraphics();
        paint(goff);
        g.drawImage(offScreenImage,0,0,null);
    }
}

