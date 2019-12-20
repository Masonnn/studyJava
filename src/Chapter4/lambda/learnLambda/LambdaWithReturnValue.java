package Chapter4.lambda.learnLambda;

import org.opencv.core.Mat;

import java.util.Map;
import java.util.function.Function;

public class LambdaWithReturnValue {
    public static void main(String[] args) throws Exception {
        String ret = randomData(String::valueOf);
        System.out.println(ret);

        String retException = randomDataWithExceptionHandling(String::valueOf);
        System.out.println(retException);
    }


    // TODO 我有数据，你有代码吗？
    private static String randomData(Function<Object, String> converter) {
        return converter.apply(Math.random());
    }

    // TODO lambda如果有 checked exception 异常，那么接口必须允许。在调用的地方，只要正常处理异常就可以了
    private static String randomDataWithExceptionHandling(ExceptionLambda<Object, String> converter) throws Exception {
        return converter.hasException(Math.random());
    }
}

interface ExceptionLambda<P, R> {
    R hasException(P p) throws Exception;
}
