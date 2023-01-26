
//数组三种初始化方式
public class TEXT2 {
    public static void main(String[] args) {
        //静态初始化
        int[] a={31,3,2,3};
        Man[] b={new Man(32,44),new Man(22,34)};

        //动态初始化
        Man[] man=new Man[10];
        Man m1=new Man(11,333);
        Man m2=new Man(12,222);
        man[0]=m1;
        man[1]=m2;

        //默认初始化
        int[] s=new int[2];//默认值0，0
        boolean[] v=new boolean[2];//默认值false，false
        String[] g=new String[2];//默认值null,null
    }
}
