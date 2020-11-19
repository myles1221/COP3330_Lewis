public  class Pyramid extends Shape3D{


    //Math.sqrt() //
    public double Result, length, height1, base;

    public Pyramid(double len, double wid, double height ) {
        Result = ((len * wid) * height)/3;
        length = len;
        height1 = height;
        base = wid;
    }

    @Override
    public double getArea() {
        double a  = base, aSquared = Math.pow(a,2), hSquared = Math.pow(height1, 2), endResult;
        double squareRoot = Math.sqrt(a/4.00 + hSquared);
        endResult = (a*a) +((2.00*a)*squareRoot);

        Result = endResult;
        return Result;
    }

    @Override
    public String getName(){
        return "pyramid";
    }


    @Override
    public double getVolume() {
        double baseArea = length*base;
        Result = baseArea * (height1/3);
        return Result;
    }
}
