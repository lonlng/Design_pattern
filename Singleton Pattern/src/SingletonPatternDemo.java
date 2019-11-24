public class SingletonPatternDemo {
    public static void main(String[] args) {
        System.out.println("hello world!");
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        object.showMessage();

//        Test01 object2 = Test01.getInstance();
//        object2.showMessage();
//        object2.showMessage();

    }
}
