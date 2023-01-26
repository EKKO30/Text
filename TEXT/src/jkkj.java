public class jkkj {
    int b=100;
    private String name;
    private double salary;
    double a;
    public jkkj(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void b(){
        for (int i= 0;i<100; i++)
        {System.out.println("a="+b--);}
    }

    public void shui(){
        if(salary<3500){
            System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
        }else if(salary>=3500){
            a=(salary-3500)*0.1-105;
            if(a<=0){
                System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
            }else{
                System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
            }
        }else if(salary>4500){
            a=(salary-3500)*0.2-555;
            System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
        }else if(salary>9000){
            a=(salary-3500)*0.25-100;
            System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
        }else if(salary>35000){
            a=(salary-3500)*0.3-2755;
            System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
        }else if(salary>55000){
            a=(salary-3500)*0.35-5505;
            System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
        }else if(salary>80000){
            a=(salary-3500)*0.45-13505;
            System.out.println(this.name+"应该缴纳的个人所得税是交税:"+a);
        }

    }

    public static void main(String[] args) {
     /*   jkkj c=new jkkj();
        c.b();
        System.out.println(c.a);
        jkkj d=new jkkj();
        System.out.println(d.a);
        String a=new String("sdfa");
        System.out.println(a);
        String b="faaaa";
        System.out.println(b);*/
        System.out.println("------------------------");
        jkkj xiaoming=new jkkj("小明",2500);
        jkkj xiaojun=new jkkj("小军",8000);
        jkkj xiaohong=new jkkj("小红",10000);
        xiaoming.shui();
        xiaojun.shui();
        xiaohong.shui();
    }
}
