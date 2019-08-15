package overload.area_calculator;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
    }

    private static double area(double radius){
        if (radius<0){
            return -1.0;
        }else {
            return Math.pow(radius,2)*Math.PI;
        }
    }
    private static double area(double x,double y){
        if(x<0||y<0){
            return -1.0;
        } else {
            return x*y;
        }
    }


}
