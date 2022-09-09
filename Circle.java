public class Circle extends nine {

    public static  final double PI=Math.PI;
    private double diameter;

    public Circle (int diameter){
        this.diameter = diameter;
    }

    public double area() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }


}
