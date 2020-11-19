public class Triangle extends Shape2D {
    public double Result;

    public Triangle(double base, double height) {
    Result = (base * height)/2;
    }
        @Override
        public double getArea() {
            return Result;
        }


        @Override
        public String getName(){
            return "triangle";
        }
    }

