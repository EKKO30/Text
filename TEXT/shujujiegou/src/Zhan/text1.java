package Zhan;

public class text1<T> extends AbstractZhan<T>{
    Object[] a=new Object[2];
    int size=0;
    @Override
    public T pop() {
        return (T)a[(size--)-1];
    }

    @Override
    public void push(T t) {
        int s=a.length;
        if(size>=a.length){
            s=s+10;
            Object[] b=new Object[s];
            for(int i=0;i<a.length;i++){ b[i]=a[i]; }
            this.a=b;
        }
        a[size]=t;
        size++;
    }
}
