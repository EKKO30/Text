import java.util.Arrays;

public class text9 {
    public static void main(String[] args) {
        int[] a={12323,44,32,2,11,33,4,56};
        int b=1;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        System.out.println(b+"该元素索引位置:"+app(a,b));
    }
    public static int app(int[] t,int c){
        int low=0;
        int high;
        high =7;
        while(low<=high){
            int middle=(low+high)/2;
            if(c==t[middle]){
                return middle;
            }
            if(c<t[middle]){
                high=middle-1;
            }
            if(c>t[middle]){
                low=middle+1;
            }
        }
        return -1;
    }
}




