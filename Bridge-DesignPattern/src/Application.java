
import com.ariful.color.impl.BlueColor;
import com.ariful.color.impl.Color;
import com.ariful.color.impl.GreenColor;
import com.ariful.color.impl.RedColor;
import com.ariful.shape.Shape;
import com.ariful.shape.impl.Circle;
import com.ariful.shape.impl.Square;
import com.ariful.shape.impl.Triangle;

public class Application {

    enum shape_types {
        RED_TRIANGLE, BLUE_TRIANGLE, GREEN_TRIANGLE, RED_CIRCLE, GREEN_CIRCLE, BLUE_CIRCLE, RED_SQUARE, GREEN_SQUARE, BLUE_SQUARE
    }

    public static void main(String[] args) {

        Shape shape;

        shape_types type = shape_types.GREEN_TRIANGLE;

        switch (type) {
            case RED_TRIANGLE:
                shape = new Triangle((Color) new RedColor());
                shape.fillColor();
                break;

            case BLUE_TRIANGLE:
                shape = new Triangle(new BlueColor());
                shape.fillColor();
                break;

            case GREEN_TRIANGLE:
                shape = new Triangle(new GreenColor());
                shape.fillColor();
                break;

            case RED_CIRCLE:
                shape = new Circle((Color) new RedColor());
                shape.fillColor();
                break;

            case BLUE_CIRCLE:
                shape = new Circle(new BlueColor());
                shape.fillColor();
                break;

            case GREEN_CIRCLE:
                shape = new Circle(new GreenColor());
                shape.fillColor();
                break;

            case RED_SQUARE:
                shape = new Square((Color) new RedColor());
                shape.fillColor();
                break;

            case BLUE_SQUARE:
                shape = new Square(new BlueColor());
                shape.fillColor();
                break;

            case GREEN_SQUARE:
                shape = new Square(new GreenColor());
                shape.fillColor();
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
