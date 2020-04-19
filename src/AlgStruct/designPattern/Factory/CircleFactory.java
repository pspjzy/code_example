package AlgStruct.designPattern.Factory;

// 定义返回 circle 实例的 CircleFactory
class CircleFactory extends ShapeFactory {
    // 重载factoryMethod方法,返回Circle对象
    protected Shape factoryMethod(String aName) {
        return new Circle(aName + " (created by CircleFactory)");
    }
}

// 定义返回 Square 实例的 SquareFactory
class SquareFactory extends ShapeFactory {
    // 重载factoryMethod方法,返回Square对象
    protected Shape factoryMethod(String aName) {
        return new Square(aName + " (created by SquareFactory)");
    }
}
