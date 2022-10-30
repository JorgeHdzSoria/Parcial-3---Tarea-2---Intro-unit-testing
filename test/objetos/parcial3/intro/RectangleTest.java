package objetos.parcial3.intro;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(8, 4);
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();

        Assertions.assertEquals(32, area);
        Assertions.assertEquals(24, perimeter);
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(8, 4);
        double perimeter = rectangle.getPerimeter();

        Assertions.assertEquals(24, perimeter);
    }
}
