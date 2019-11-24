package _01;

import java.util.Random;

public class Test01 {
    private Test01() {
    }

    private static Test01 instance = new Test01();

    public static Test01 getInstance() {
        return instance;
    }

    Random random = new Random();

    public void showMessage() {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%d*%d=%d\t", j, i, j * i);
//            }
//            System.out.println();
//        }
        int ranNum = random.nextInt(10);
        System.out.println(ranNum);


    }
}
