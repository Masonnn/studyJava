package Chapter4.Annotation.learnnnotation;

public class TestUseAnnotation {
    //    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
    //        abc = 9, defaultValues = {"aaa", "bbb"})
    private Object abc;

    @Deprecated
    // TODO 给annotation里的属性赋值的方式
    @PrimaryProperty(defalultValue = "testbgggg", targetClass = TestUseAnnotation.class, abc = 9, defaultValues = {"aaa", "bbb"})
    public void test() {

    }
}
