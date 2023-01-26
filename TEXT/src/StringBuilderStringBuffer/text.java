package StringBuilderStringBuffer;
//StringBuilder,StringBuffer的使用
public class text {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder();
        str1.append(2);
        str1.append(3.1);
        System.out.println(str1);

        StringBuilder str12=new StringBuilder();
        str12.append("ja");
        str12.append("va");
        System.out.println(str12);

        str12.delete(2,4);//左闭右开
        System.out.println(str12);

        str12.replace(0,2,"a");//替换
        System.out.println(str12);

        str12.insert(0,"dfa");
        System.out.println(str12);

        str12.reverse();//逆转序列
        System.out.println(str12);

        char sq=str12.charAt(1);//查
        System.out.println(sq);

        str12.setCharAt(1, 'b');//修改该索引的数据
        System.out.println(str12);
        str12.append(String.valueOf(87978789));
        double a=10000.00;
        System.out.println(a/100);
    }
}
