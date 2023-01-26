package lianbiao;

import shunxubiao.AbstraList;

public class text1<E> extends AbstractList1<E> {
    //链表
    Node<E> head=new Node<>(null);
    int size=0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e, int index) {
        if(index>size) throw new IllegalArgumentException("超出长度");
        Node<E> node=head,temp;
        for (int i = 0; i < index; i++) { node=node.next; }
        temp=node.next;
        Node<E> a=new Node<>(e);
        node.next=a;
        node.next.next=temp;
        size++;
    }

    @Override
    public E remove(int index) {
        if(index>size) throw new IllegalArgumentException("超出长度");
        Node<E> node=head,temp;
        for (int i = 0; i < index; i++) { node=node.next; }
        temp=node.next;
        node.next=node.next.next;
        size--;
        return temp.e;

    }

    @Override
    public E get(int index) {
        if(index>size) throw new IllegalArgumentException("超出长度");
        Node<E> node=head.next;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node.e;
    }
    class Node<E>{
        E e;
        Node<E> next;
        public Node(E e){
            this.e=e;
        }
    }
}
