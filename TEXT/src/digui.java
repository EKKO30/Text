public class digui {
    public static void main(String[] args) {
        int n;
        n=5;
        double a=digui(n);
        System.out.println(digui(n));
    }
    public static int digui(int n){
        if(n!=1){
            return n*digui(n-1);
        }
        else{
            return 1;
        }
    }
}
