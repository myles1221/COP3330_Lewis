public class Cube extends Shape3D {
    public double Result, value;

    public Cube(double x ) {
        value = x;
        Result = 6*(Math.pow(x, 2));
    }
    @Override
    public double getVolume() {
        Result = Math.pow(value, 3);
        return Result;
    }


    @Override
    public String getName(){
        return "cube";
    }

    @Override
    public double getArea() {
        return Result;
    }
}
