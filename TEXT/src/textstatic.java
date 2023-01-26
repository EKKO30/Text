import java.util.Arrays;

public class textstatic {
    int a,b;
    String school;
    static String schoolname="天府";

    public textstatic(int a,int b){
        this.a=a;
        this.b=b;
    }
    static void printname(){
        System.out.println(schoolname);
    }

    public static void main(String[] args) {
        textstatic hi=new textstatic(3,4);
        textstatic.printname();
        textstatic.schoolname="湖科大";
        textstatic.printname();

    }
}
