package Lesson73_extends._36;

import Lesson73_extends._36.supermarket.Phone;
import Lesson73_extends._36.supermarket.Phone2;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {
//        Phone phone = new Phone(
//                "手机001", "Phone001", 100, 1999, 999,
//                4.5, 3.5, 4, 128, "索尼", "安卓"
//        );

//        phone.describe();
//        System.out.println();
//
//        System.out.println(phone.getName());
//        System.out.println();
//
//        phone.buy(100);
//
//        phone.buy(3);


        Phone2 phone = new Phone2(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        Phone2 test = new Phone2();

        test.describe();

        System.out.println("===============Above is TEST===============");
        phone.describe();
        System.out.println();

        System.out.println(phone.getName());
        System.out.println();

        phone.buy(100);

        phone.buy(3);
    }
}