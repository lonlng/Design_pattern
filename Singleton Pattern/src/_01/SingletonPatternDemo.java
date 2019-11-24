package _01;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        System.out.println("hello world!");
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        object.showMessage();

//        _01.Test01 object2 = _01.Test01.getInstance();
//        object2.showMessage();
//        object2.showMessage();

    }
}
