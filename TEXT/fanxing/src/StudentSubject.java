public class StudentSubject<T> implements scoreInterface<T>{//若接口明确类型则只能用此类型
    String name;
    int id;
    T score;//在创建对象前是Object，创建对象后是指定类型，不能static
    //不用泛型无法取出数据，必须强制转换

    public StudentSubject(){}

    public StudentSubject(String name,int id,T score){
        this.name=name;
        this.id=id;
        this.score=score;
    }

    public static <E> void printing(E e){
        System.out.println(e);
    }

    @Override
    public T getScore() {
        return null;
    }

    public void setScore(T score) {
        this.score = score;
    }
}
