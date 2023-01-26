
import java.util.Arrays;

public class text5 {
    //多维数组
    public static void main(String[] args) {
        int[][] a=new int[3][];
        a[2]=new int[]{3,2,1};
        a[1]=new int[1];
        a[0]=new int[2];
        a[0][0]=133;
        a[1][0]=233;


        int[][] b={{1,3,2,3},
                {44,33,2,1},
                {231,444,2313,331}};
        System.out.println(b[2][2]);
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
        System.out.println(Arrays.toString(b[2]));

        Object[] c1={111,"xx",18,"student"};
        Object[] c2={112,"yy",19,"student"};
        Object[] c3={113,"zz",34,"teacher"};
        Object[][] c=new Object[3][];
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        System.out.println(Arrays.toString(c[2]));

    }
}
