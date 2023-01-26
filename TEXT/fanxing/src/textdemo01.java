
//泛型类
public class textdemo01<T> {
    T name;

    public textdemo01(T name){
        this.name=name;
    }

    public T getName(){
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        textdemo01<String> a1=new textdemo01("dfsfsd");
        textdemo01<Integer> a2=new textdemo01(123);
    }
}
