public class xctext04 implements Runnable{
    String name;

    public xctext04(String name) {
        this.name=name;
    }

    public xctext04(){
    }


    public void run(){
        System.out.println("开启线程"+name);
        for(int i=10;i>0;i--){
            System.out.println(name+"线程进行"+i);
            //线程睡眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(name + "线程结束");
    }

    public static void main(String[] args) {
        xctext02 q1=new xctext02("ekko-1");
        q1.start();

        xctext02 q2=new xctext02("ekko-2");
        q2.start();
    }
}
