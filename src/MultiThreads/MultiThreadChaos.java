package MultiThreads;

public class MultiThreadChaos {
    public static void main(String[] args) throws InterruptedException {
        // TODO 同样的运算，安排在两个线程里做，结果就不一样了

//        DataHolder dataHolder2 = new DataHolder();
//        DataHolder dataHolder = new DataHolder();

        Thread increaseThread = new Thread(new ChangeData(-2, Integer.MAX_VALUE/50, null));
        Thread decreaseThread = new Thread(new ChangeData(2, Integer.MAX_VALUE/50, null));
        System.out.println("执行开始");
        increaseThread.start();
        Thread.sleep(50);
        decreaseThread.start();
    }
}
