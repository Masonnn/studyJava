package Lesson02.learnthread;

import static Lesson01.Whatisthread.StopALittle.printSlowly;

public class CreateThreadAppMain {
    private static final String TEXT = "太阳在这个平静的小村庄缓缓升起，又是开始了平常的一天。我们故事的主人公睡眼惺忪的起来\n" +
            "......";

    public static void main(String[] args) {
        // TODO 代码是被线程执行的，任何代码都可以通过Thread.currentThread()获取执行当前代码的线程
        System.out.println("程序开始，执行的线程名字叫做" + Thread.currentThread().getName());

        for (int i = 1; i <= 2; i++) {
            // TODO 学习创建线程的方法
            // TODO Runnable接口里的run是线程执行的方法，执行完毕，线程就结束了
            // TODO 理解代码是在线程里被执行的，同样的代码可以被多个线程执行。
            // TODO 暂停一下 Java ，看看有多少线程，每个线程的名字等信息
            Thread thread = new Thread((Runnable) new PrintStoryRunnable(TEXT, 200 * 2), "我的线程-" + i);
            // TODO 创建好线程之后，如果要启动线程，必须调用start方法，注意不是run方法
            thread.start();
        }


    }

    static class PrintStoryRunnable implements Runnable {
        private String text;
        private long interval;

        public PrintStoryRunnable(String text, long interval) {
            this.text = text;
            this.interval = interval;
        }

        @Override
        public void run() {
            try {
                double num = Math.random();
                System.out.println("执行这段代码的线程名字叫做" + Thread.currentThread().getName());
                printSlowly(text, interval);
                System.out.println(Thread.currentThread().getName() + "执行结束");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
