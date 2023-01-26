public class text1 {
    public static void main(String[] args) {
        Student a=new Student(13,"小明");
        a.setStatus(status.sleep);
        System.out.println(a.getAge());
        System.out.println(a.getName());
        System.out.println(a.getStatus().getName());
        System.out.println(status.valueOf("sleep"));//有这个枚举就使用
 //       System.out.println(status.valueOf("slee"));//没有这个枚举就报错
        for(status value:status.values())//输出所有枚举
            System.out.println(value.getName());
     //       System.out.println(value);只能输出一行value
    }
}
