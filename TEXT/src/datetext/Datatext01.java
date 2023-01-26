package datetext;

import java.util.Date;

//date类应用
public class Datatext01 {
    public static void main(String[] args) {
        Date date1=new Date();
        Date date2=new Date(5000);

        System.out.println(date1);//返回当前时间
        System.out.println(date1.toString());
        System.out.println(System.currentTimeMillis());//返回当前时间的时间戳long型
        System.out.println(date2);//返回1970.1.1 8：00（+加上5000ms ）
    }
}
