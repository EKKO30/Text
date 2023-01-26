public class text1 {

    public static void main(String[] args) {
        StudentSubject<String> a=new StudentSubject("xx",1001,"优秀");
        System.out.println(a.score);
        String b=a.score;//若a.score是object则需要强制转换
        StudentSubject<Integer> a1=new StudentSubject("xx",1001,99);
        System.out.println(a1.score);
        StudentSubject a2=new StudentSubject();
        a2.printing("fdsaf");

    }
}
