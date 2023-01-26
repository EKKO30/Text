package shunxubiao;

public abstract class AbstraList<T> {

    public abstract int size();
    public abstract  void add(T t,int index);
    public abstract T remove(int index);
    public abstract T get(int index);
}
