package factoryPattern;

public class ShapeFactory {
    public Shape shape;

    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case ShapeConstants.CIRCLE -> new Circle();
            case ShapeConstants.RECTANGLE -> new Rectangle();
            case ShapeConstants.TRIANGLE -> new Triangle();
            default -> {
                System.out.println("Invalid shape type: " + shapeType);
                yield null;
            }
        };
    }
}