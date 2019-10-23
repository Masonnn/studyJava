package Lesson62_65.learn;

public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了 InvokeMain 的方法");
        LearnMain.main(args);
        System.out.println("InvokeMain 的 main方法 执行结束");
    }
}
