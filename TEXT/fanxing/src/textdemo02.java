public class textdemo02<T> implements textdemo<T>{
    T name;
    public T getName(){
        return name;
    }

    public <T> void soutsomething(T t){
        System.out.println("t="+t);
    }

    public static void main(String[] args) {
        textdemo02 b=new textdemo02();
        b.soutsomething(123);
        b.soutsomething("sdafsdf");
    }
}
