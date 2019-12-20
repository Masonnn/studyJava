package Chapter4.lambda.learnLambda;

import java.util.ArrayList;
import java.util.List;

public class IterateListLambdaWhereAppMain {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        myList.forEach(IterateListLambdaWhereAppMain::processString);
    }

    private static void processString(String str) {
        throw new RuntimeException();
    }

    private static List<String> addElementsToList(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add("str" + (i % 5));
        }
        return list;
    }
}
