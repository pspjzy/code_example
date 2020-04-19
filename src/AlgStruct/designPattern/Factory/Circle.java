package AlgStruct.designPattern.Factory;

// 圆形子类
class Circle extends Shape {
    public void draw() {
        System.out.println("It will draw a circle.");
    }
    public void erase() {
        System.out.println("It will erase a circle.");
    }
    // 构造函数
    public Circle(String aName){
        super(aName);
    }
}
// 方形子类
class Square extends Shape {
    public void draw() {
        System.out.println("It will draw a square.");
    }
    public void erase() {
        System.out.println("It will erase a square.");
    }
    // 构造函数
    public Square(String aName){
        super(aName);
    }
}