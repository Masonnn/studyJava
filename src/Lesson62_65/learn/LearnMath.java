package Lesson62_65.learn;

import java.util.Random;

public class LearnMath {
    public double adc;

    public static void main(String[] args) {
        // TODO 我们调用的都是 Math 里的静态方法，Math的构造函数就是private的，意味着不能创建Math类的实例
        System.out.println(Math.random());

        // TODO 原来归根结底，Math的random是用的Random类来实现的。它在java.util包里
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.abs(random.nextInt()));
        }
        System.out.println(Math.abs(-9));


        System.out.println(Math.round(-9.2));
        System.out.println(Math.round(-9.5));
        System.out.println(Math.round(-9.8));
        System.out.println(Math.round(9.2));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(9.8));
        System.out.println("=============================");
        System.out.println(Math.round(-9.4));
        System.out.println(Math.round(-9.5));
        System.out.println(Math.round(-9.6));

    }
}
