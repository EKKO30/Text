package shunxubiao;

import shunxubiao.AbstraList;

public class text3 <T> extends AbstraList<T> {
    //顺序表
    Object[] a=new Object[2];
    int size =0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T t, int index) {
        int s=a.length;
        while(s-1<index){ s=s+10; }
        if(size>=a.length){s=s+10;}
        Object[] b=new Object[s];
        for(int i=0;i<a.length;i++){ b[i]=a[i]; }
        this.a=b;
        if(a[index]==null){
            a[index]=t;
        }else{
            int i=size-1;
            System.out.println(i);
            while(i>=index){
                a[i+1]=a[i];
                i--;
            }
        }
        a[index]=t;
        size++;
    }

    @Override
    public T remove(int index) {
        if(index>a.length-1) throw new IllegalArgumentException("超出长度");
        T t= (T) a[index];
        a[index]=null;
        int c=index;
        while(c<=a.length-2){
            a[c]=a[c+1];
            c++;
        }
        size--;
        return t;
    }

    @Override
    public T get(int index) {
        if(index>a.length-1) throw new IllegalArgumentException("超出长度");
        return (T)a[index];
    }
}
