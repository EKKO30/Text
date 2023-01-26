public class rftext01 {
    //获取Class
    public static void main(String[] args) throws ClassNotFoundException {
        Class clz = Class.forName("Student");
        System.out.println(clz.getName());
        System.out.println("------------------------");

        Class clz1 = Student.class;
        System.out.println(clz1);
        System.out.println("------------------------");

        Student str = new Student();
        Class clz2 = str.getClass();
        System.out.println(clz2);
        System.out.println("-------------------------");

        String q=new String("java");
        Class clz3=q.getClass();
        System.out.println(clz3);
    }
}
