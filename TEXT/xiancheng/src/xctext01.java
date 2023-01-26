
//通过继承Thread来创建线程
public class xctext01 extends Thread{
    public static void main(String[] args) {
        xctext01 a=new xctext01();
        a.start();
    }

    public void run(){
        System.out.println("java");
    }
}
