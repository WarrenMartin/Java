// Generic Class
class MyGen<T>{
    T data;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}

public class GenericDemo {

    public static void main(String[] args) {

        MyGen<String> m1 =new MyGen<>();
        m1.setData("ABC");
        m1.setData("xyz");

        MyGen<Integer> m2=new MyGen<>();

        m2.setData(10);
        m2.setData(11);

        System.out.println(m1.getData());

        System.out.println(m2.getData());
    }
}
