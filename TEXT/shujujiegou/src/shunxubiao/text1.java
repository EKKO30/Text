package shunxubiao;

import shunxubiao.AbstraList;

public class text1<T> extends AbstraList<T> {
    //顺序表
    Object[] arr=new Object[2];
    int size=0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T t, int index) {
        System.out.println("-----------------------");
        System.out.println(size);
        System.out.println(arr.length);
        if(index>size) throw new IllegalArgumentException("超出长度");
        if(size>= arr.length){
            Object[] arr=new Object[this.arr.length+10];
   //         System.out.println(this.arr.length);
  //          System.out.println(arr.length);
            for(int i=0;i<this.arr.length;i++)arr[i]=this.arr[i];
            this.arr=arr;
        }
  //     System.out.println(this.arr.length);
   //     System.out.println(arr.length);
        int i=size-1;
     //   System.out.println(i);
        while(i>=index){
            arr[i+1]=arr[i];
            i--;
        }
        arr[index]=t;
        size++;
     //   System.out.println(size);
    }

    @Override
    public T remove(int index) {
        if(index>size-1) throw new IllegalArgumentException("超出长度");
        T t= (T) arr[index];
        int c=index;
        while(c<=size-1){
            arr[c]=arr[c+1];
            c++;
        }
        size--;
        return t;
    }

    @Override
    public T get(int index) {
        if(index>size-1) throw new IllegalArgumentException("超出长度");
        return (T)arr[index];
    }
}
