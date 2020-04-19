package AlgStruct.designPattern.Factory;

public class Test {
    public static void main(String[] args){
        ShapeFactory sf1 = new SquareFactory();
        ShapeFactory sf2 = new CircleFactory();
        sf1.anOperation("Shape one");
        sf2.anOperation("Shape two");
    }
}
