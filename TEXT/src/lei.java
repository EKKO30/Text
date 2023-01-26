public class lei {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("学习中");
    }

    public static void main(String[] args) {
        lei s1=new lei();
        s1.age=18;
        s1.id=1111;
        s1.sname="盛大";
        System.out.println(s1.id);
        s1.study();

    }

}
