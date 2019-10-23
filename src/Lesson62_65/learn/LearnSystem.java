package Lesson62_65.learn;

public class LearnSystem {
    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();
//        System.out.println(startMS);

        int counter = 0;
        for (int i = 0; i < 100000000; i++) {
            counter++;
        }

        long endMS = System.currentTimeMillis();
        System.out.println("程序执行使用了 " + (endMS - startMS) + " 毫秒");

        long startNS = System.nanoTime();

        counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endNS = System.nanoTime();
        System.out.println("程序执行使用了 " + (endNS - startNS) + " 纳秒");
    }
}
