package Lesson73_extends._36.supermarket;

public class Phone extends MerchandiseV2 {

    // 给Phone增加新的属性和方法
    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;

    public Phone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {

        // >> TODO 可以认为，创建子类对象的时候，也就同时创建了一个隐藏的父类对象

        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        // >> TODO 所以，才能够setName，对name属性进行操作。
        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }

    // >> TODO 通过使用和父类方法签名一样，而且返回值也必须一样的方法，可以让子类覆盖(override)掉父类的方法

    // >> TODO ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓下面才是继承的终极奥义↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // >> TODO 也就是说，子类并不是只能把父类的方法拿过来，而且可以通过覆盖来替换其中不适合子类的方法

    // >> TODO ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑上面才是继承的终极奥义↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑


    // >> TODO 题外话：属性是联动的，可能是有特殊意义的。
    //    TODO 所以直接给属性赋值是危险的，因为没有办法检查新的值是否有意义，也没法对这个修改做联动的修改


    public double buy(int count) {

        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        // >> TODO 使用super可以调用父类的方法和属性（当然必须满足访问控制符的控制）
        return super.buy(count);
    }

    // >> TODO 返回值必须一样，不是类型兼容，而是必须一摸一样。
    // >> TODO 如果签名一样，但是返回值不一样，会是错误
    //    public int buy(int count) {
    //        if (count > MAX_BUY_ONE_ORDER) {
    //            return -2;
    //        }
    //        if (this.count < count) {
    //            return -1;
    //        }
    //        return this.count -= count;
    //    }

    // >> TODO 返回值必须一样，不是类型兼容，而是必须一摸一样
    //    public boolean buy(int count) {
    //        return true;
    //    }


    // >> TODO 覆盖可以覆盖掉父类的方法。同一个方法，不同的行为。
    // >> TODO 这，就是多态！
    // >> TODO 方法可以覆盖，属性访问不可以，所以这也是使用方法的一个原因。
    //    TODO 即使在父类里，只是一个简单的getName，但是这样做，子类就可以覆盖掉父类的方法
    //    TODO 方法不止眼前的代码，还有子类的覆盖。用方法，才能覆盖，才能多态。

    public String getName() {
        return this.brand + ":" + this.os + ":" + name;
    }

    // TODO 根据我们对覆盖的理解，Phone类里的describePhone方法应该叫做describe
    // TODO 同样的，我们想哟调用父类里的describe方法，试试看？
    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主频" + cpuHZ + " GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "存储空间" + storageG + "Gb");
    }


    // >> TODO super是子类和父类交流的桥梁，但是并不是父类的引用
//     >> TODO 所以，super和this自引用不一样，不是简单可以模拟的（可以模拟的话不就成了组合了吗）
//    public MerchandiseV2 getParent(){
//        return super;
//    }

    public Phone getThisPhone() {
        return this;
    }

    // >> TODO 使用super可以调用父类的public属性，但是super不是一个引用。
    public void accessParentProps() {
        System.out.println("父类里的name属性" + super.name);
    }


    public void useSuper() {
        // >> TODO super的用法就像是一个父类的引用。它是继承的一部分，像组合的那部分，但不是全部
        super.describe();
        super.buy(66);
        System.out.println("父类里的count属性：" + super.count);
    }


//    public void describe() {
//        System.out.println("此手机商品属性如下");
//        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
//                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
//                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
////        describe();
//        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
//                "屏幕：" + screenSize + "寸\n" +
//                "cpu主频" + cpuHZ + " GHz\n" +
//                "内存" + memoryG + "Gb\n" +
//                "存储空间" + storageG + "Gb");
//    }
//


    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public static int getMaxBuyOneOrder() {
        return MAX_BUY_ONE_ORDER;
    }

    public static void setMaxBuyOneOrder(int maxBuyOneOrder) {
        MAX_BUY_ONE_ORDER = maxBuyOneOrder;
    }
}
