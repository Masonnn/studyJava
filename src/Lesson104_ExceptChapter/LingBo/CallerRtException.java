package Lesson104_ExceptChapter.LingBo;

import Lesson104_ExceptChapter.LingBo.myexceptions.MyRuntimeException;

public class CallerRtException {
    public static void main(String[] args) {
        Caller1 caller1 = new Caller1();
        System.out.println("调用 开始");
        try {
            caller1.call2RTException();
        } catch (MyRuntimeException ex) {
            // >> TODO 错误的演示！不应该使用异常做正常处理逻辑下的跳转
            System.out.println("凌波微步收到");
        }
        System.out.println("调用 结束");
    }
}
