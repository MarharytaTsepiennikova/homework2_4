package Task2;

public class Rectangle extends Figure {

    protected int hight;
    protected int width;

    Rectangle(int hight, int width){
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double getSquare() {
        double result;
        result = hight * width;
        return result;
    }
}
