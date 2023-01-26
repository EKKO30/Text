import java.util.concurrent.SynchronousQueue;
import java.util.*;
public class Method {
    public static void main(String[] args){
        System.out.println("请输入迟到时间和月薪");
        Scanner s=new Scanner(System.in);
        int latetime,monthsalary;
        latetime=s.nextInt();
        monthsalary=s.nextInt();
        late(latetime,monthsalary);
    }
    public static double late(int latetime,int monthsalary){
        double fakuan=0;
        double daysalary=monthsalary/30;
        if(latetime<10){
            System.out.println("警告");
            fakuan=0;
        }
        else if(latetime<20){
            System.out.println("罚日薪的10%");
            fakuan=daysalary*0.1;
        }
        else if(latetime<30){
            System.out.println("罚日薪的20%");
            fakuan=daysalary*0.2;
        }
        else{
            System.out.println("罚日薪的30%");
            fakuan=daysalary*0.3;
        }
        System.out.println("罚款为："+fakuan);
        return fakuan;
    }
}