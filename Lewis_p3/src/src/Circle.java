public class Circle extends Shape2D{
    public double Result;

    public Circle(double i) {
        double pi = 3.14, radius;
        radius = i;
        Result = pi * (radius * radius);

    }


    @Override
    public double getArea() {
        return Result;
    }


    @Override
    public String getName() {
        return "circle";
    }
}