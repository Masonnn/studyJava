package Lesson01.Whatisthread;

public class StopALittle {
    public static void main(String[] args) throws InterruptedException {
        printSlowly("啦呀你好咔咔咔，呼噜呼噜都是哇\n" + "……", 300);
    }

    public static void printSlowly(String text, long interval) throws InterruptedException {
        for (char ch : text.toCharArray()) {
            Thread.sleep(interval);
            System.out.print(ch);
        }
        System.out.println();
    }
}
