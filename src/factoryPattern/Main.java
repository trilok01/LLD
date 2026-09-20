package factoryPattern;

class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeConstants.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeConstants.RECTANGLE);
        Shape triangle = shapeFactory.getShape(ShapeConstants.TRIANGLE);

        circle.draw();
        rectangle.draw();
        triangle.draw();

        Shape square = shapeFactory.getShape(ShapeConstants.SQUARE);
    }
}