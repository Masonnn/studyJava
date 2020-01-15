package Lesson104_ExceptChapter.AutoClosable;

import java.io.IOException;

public class MyAutoClosableResource implements AutoCloseable {

    private String resName;
    private int counter;

    public MyAutoClosableResource(String resName) {
        this.resName = resName;
    }

    public String read() throws IOException {
        counter++;
        if (Math.random() > 0.5) {
            return "You got lucky to read from " + resName + " for " + counter + " times...";
        } else {
            throw new IOException("resource不存在哦");
        }
    }

    @Override
    public void close() throws Exception {
//        String resName;
        System.out.println("资源释放了" + resName);
    }
}
