package Lesson101_AnonymousClass;

import Lesson101_AnonymousClass.supermarket.Phone;
import Lesson101_AnonymousClass.supermarket.UnitSpec;

public class UseAnonymousClass {
    public static void main(String[] args) {
        Phone phone = new Phone(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );


        printSpec(new UnitSpec() {
            @Override
            public double getNumSpec() {
                return 123;
            }

            @Override
            public String getProducer() {
                return "new as an argument";
            }
        });
    }

    private static void printSpec(UnitSpec spec) {
        System.out.println("Spec producer=" + spec.getProducer() + ". Num=" + spec.getNumSpec());
    }
}
