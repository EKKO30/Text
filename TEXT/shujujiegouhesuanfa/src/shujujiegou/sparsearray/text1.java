package shujujiegou.sparsearray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//稀疏数组
//将二维数组转化为稀疏数组，将稀疏数组还原为二维数组，保存稀疏数组和读取稀疏数组
public class text1 {
    public static void main(String[] args) throws IOException {
        int array[][]=new int[11][11];
        array[1][2]=1;
        array[2][3]=2;
        System.out.println("原始二维数组");
        //遍历二维数组
        for(int[] t:array){
            for(int b:t){
                System.out.printf("%d  ",b);
            }
            System.out.println();
        }
        
        //二维数组转稀疏数组
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println(sum);//原二维数组非0值有几个
        //稀疏数组
        int count=0;
        int array1[][]=new int[sum+1][3];
        array1[0] = new int[]{11, 11, sum};

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array[i][j]!=0){
                    count++;
                    array1[count] =new int[]{i,j,array[i][j]};
                }
            }
        }

        for(int[] t:array1){
            for(int b:t){
                System.out.printf("%d\t",b);
            }
            System.out.println();
        }

        //稀疏数组转为二维数组
        int a1 = 0,a2=0,a3=0;
        int array2[][]=new int[array1[0][0]][array1[0][1]];
        //稀疏数组给二维数组赋值
        for (int i = 1; i < sum+1; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==0){
                    a1=array1[i][j];
                }
                if(j==1){
                    a2=array1[i][j];
                }
                if(j==2){
                    a3=array1[i][j];
                }
            }array2[a1][a2]=a3;
        }
        //输出还原的二维数组
        for(int[] t:array2){
            for(int b:t){
                System.out.printf("%d\t",b);
            }
            System.out.println();
        }
        method("F://xishushuzu.txt",array1,sum);
        method1("F://xishushuzu.txt");

    }
    public static void method(String path,int[][] array,int sum) throws IOException {
        int i=0;
        FileOutputStream a=new FileOutputStream(path);

        byte[] b=new byte[1024];
        for (int er = 1; i < sum+1; i++) {
            for (int j = 0; j < 3; j++) {
                String hg=String.valueOf(array[i][j]);
                if(j==2){
                    hg=hg+"\n";
                }else{
                    hg=hg+"\t";
                }
                b=hg.getBytes(StandardCharsets.UTF_8);
                a.write(b);
            }
            System.out.println();
        }

        a.close();
    }

    public static void method1(String path) throws IOException {
        FileInputStream b=new FileInputStream(path);
        int len;
        while((len=b.read())!=-1){
            System.out.printf("%s",(char)len);
        }

        b.close();
    }

}
