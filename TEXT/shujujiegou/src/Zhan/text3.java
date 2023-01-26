package Zhan;
//队列
public class text3<T> extends AbstractZhan<T> {
    Object[] b=new Object[3];
    int head=0,tail=0;
    @Override
    public T pop() {
        T t=(T)b[head];
        head=(head+1)%b.length;
        return t;
    }

    @Override
    public void push(T t) {
        int next=(tail+1)%b.length;
        if(next==head){
            return;
        }
        b[tail]=t;
        tail=(tail+1)%b.length;
    }
}
