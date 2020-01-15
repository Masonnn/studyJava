package Lesson104_ExceptChapter.LingBo;

import Lesson104_ExceptChapter.LingBo.myexceptions.MyException;

public class Caller1 {
    Caller2 caller2 = new Caller2();
    // >> TODO 我们可以在调用链的任何一个地方，通过catch语句来捕获异常，阻止异常的传递

    public void call2RTException(){
        System.out.println("Caller1.call2RTException 开始");
        caller2.call3RTException();
        System.out.println("Caller1.call2RTException 结束");
    }

    public void call2Exception() throws MyException, ClassNotFoundException {
        System.out.println("Caller1.call2Exception 开始");
        caller2.call3Exception();
        System.out.println("Caller1.call2Exception 结束");
    }
}
