public class Sphere extends Shape3D{

    public double Result, pi= 3.14, radius;

    public Sphere(double rad) {
        double pi = 3.14, cubed;
        cubed = Math.pow(rad,3);
        radius = rad;
        Result = (4/3)*(pi*cubed);
    }

    @Override
    public double getArea() {
        radius = Math.pow(radius, 2);
        pi = Math.PI;
        Result = 4 * pi * radius;
        return Result;
    }

    @Override
    public String getName(){
        return "sphere";
    }

    @Override
    public double getVolume() {
        pi = Math.PI;
        Result = 4*(pi*Math.pow(radius,3))/3;
        return Result;
    }
}
