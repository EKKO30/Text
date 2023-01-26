public class text2 {


    public static void main(String[] args) {
        StudentSubject1<Integer> a1=new StudentSubject1("1002",123,33);
        StudentSubject1<Integer> a2=new StudentSubject1("1002",123,44.5);
        Number b1= a2.score;//取了上限就只能用上限来定义新变量取值
        System.out.println(b1);

        StudentSubject1<? super Integer> a3=new StudentSubject1("1002",123,232);

    }
}
