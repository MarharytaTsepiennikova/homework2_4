package Task2;

public class Circle extends Figure {
    protected double radius;

    Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getSquare() {
        double result;
        result = Math.PI * radius * radius;
        return result;
    }
}
