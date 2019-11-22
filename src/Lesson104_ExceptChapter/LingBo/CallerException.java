package Lesson104_ExceptChapter.LingBo;

import Lesson104_ExceptChapter.LingBo.myexceptions.MyException;

public class CallerException {
    public static void main(String[] args) throws ClassNotFoundException, MyException {
        Caller1 caller1 = new Caller1();
        System.out.println("调用 开始");

        caller1.call2Exception();

        System.out.println("调用 结束");

    }
}
