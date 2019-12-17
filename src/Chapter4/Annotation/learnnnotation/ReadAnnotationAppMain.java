package Chapter4.Annotation.learnnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReadAnnotationAppMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = TestUseAnnotation.class;
        Method method = clazz.getMethod("test");
        for (Annotation annotation : method.getAnnotations()){
            System.out.println(annotation.annotationType());
        }

        PrimaryProperty primaryPropertyAnnotation = method.getAnnotation(PrimaryProperty.class);
        System.out.println(primaryPropertyAnnotation.abc());
        System.out.println(primaryPropertyAnnotation.defalultValue());
        System.out.println(Arrays.asList(primaryPropertyAnnotation.defaultValues()));
        System.out.println(primaryPropertyAnnotation.targetClass());

    }
}
