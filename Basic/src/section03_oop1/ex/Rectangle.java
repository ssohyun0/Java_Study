package section03_oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateAtrea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        if (width == height) return true;
        return false;

    }
}
