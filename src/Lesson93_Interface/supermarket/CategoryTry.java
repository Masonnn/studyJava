package Lesson93_Interface.supermarket;

public enum CategoryTry {
    // >> TODO 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1, "a"),
    COOK(3,"b"),
    SNACK(5,"c"),
    CLOTHES(7,"d"),
    ELECTRIC(9,"e");

    // 可以有属性
    private int id;
    private String mark;

    // >> TODO 构造方法必须是private的，不写也是private的
    private CategoryTry(int id, String mark) {
        this.id = id;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CategoryTry{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                '}';
    }

}
