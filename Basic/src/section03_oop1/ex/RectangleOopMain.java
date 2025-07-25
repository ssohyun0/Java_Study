package section03_oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 8;
        rectangle.width = 5;

        int area = rectangle.calculateAtrea();
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 : " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square);
    }
}
