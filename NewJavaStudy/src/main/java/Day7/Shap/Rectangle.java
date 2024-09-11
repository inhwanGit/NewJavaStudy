package Day7.Shap;

public class Rectangle extends Shaps {

    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        // 사각형 넓이 = (가로) X (세로)
        return width * height;
    }

    @Override
    double round() {
        // 사각형의 둘레 = 2 * (가로+세로)
        return 2 * (width + height);
    }

    //getter, setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //toString

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
