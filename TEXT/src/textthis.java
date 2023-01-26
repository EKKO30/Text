public class textthis {
    int a,b,c;
    textthis(){
        System.out.println("初始化的对象"+this);
    }
    textthis(int a,int b){
        this();
        this.a=a;
        this.b=b;
    }
    textthis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }
    void eat(){
        System.out.println(this+"回去吃饭");
    }
    public static void main(String[] args){
        textthis hi=new textthis(2,3,8);
        hi.eat();
        System.out.println(hi.c);
    }
}
