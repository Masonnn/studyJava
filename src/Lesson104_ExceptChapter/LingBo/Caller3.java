package Lesson104_ExceptChapter.LingBo;

import Lesson104_ExceptChapter.LingBo.myexceptions.MyException;
import Lesson104_ExceptChapter.LingBo.myexceptions.MyRuntimeException;

public class Caller3 {
    public void callThrowRTException() {
        System.out.println("Caller3.callThrowRTException 开始");
        try {
            Object n = null;
            n.toString();
        } catch (NullPointerException ex) {
            System.out.println("这种情况很正常，开始凌波微步到指定地点继续处理程序！");
            throw new MyRuntimeException("执行toString的时候出错了！", ex);
        }

        System.out.println("Caller3.callThrowRTException 结束");
    }

    public void callThrowException() throws MyException {
        System.out.println("Caller3.callThrowException 开始");
        // try语句中的局部变量在catch中是不可见的
        String className = "com.neverland.Rabbit";

        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new MyException("尝试加载类出错：" + className, e);
        }


        System.out.println("Caller3.callThrowException 结束");
    }
}
