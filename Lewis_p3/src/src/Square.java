import java.text.DecimalFormat;
import java.util.*;

public class Square extends Shape2D {

    public double Result;

    public Square(double value) {

        this.Result = Math.pow(value, 2);

    }

    @Override
    public double getArea() {
        return Result;
    }


    @Override
    public String getName() {
        return "square";
    }

}
