public class SingleObject {

    //创建SingleObject对象,instance
    private static SingleObject instance = new SingleObject();
    static int num = 10;

    //构造函数
    private SingleObject() {
    }

    //静态方法,放回SingleObject类型对象
    public static SingleObject getInstance() {
        return instance;
    }

    //公开的无返回的showMessage方法
    public void showMessage() {
        System.out.println("Hello World!");
        num++;
        System.out.println(num);
    }

}
