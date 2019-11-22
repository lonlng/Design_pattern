public class SingletonPatternDemo {
    public static void main(String[] args) {
        System.out.println("hello world!");
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
