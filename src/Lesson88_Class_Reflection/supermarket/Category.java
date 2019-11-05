package Lesson88_Class_Reflection.supermarket;

// >> TODO 使用enum而非class声明
public enum Category {

    // >> TODO 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1),
    // >> TODO 不可以重名
//    F0OD(1),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELECTRIC(9);


    // 可以有属性
    private int id;

    Category(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
