public class ShapeFactory {
    // Constants
    private static final int MAX_PER_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;

    // Counters
    private static int circleCount = 0;
    private static int squareCount = 0;
    private static int rectangleCount = 0;
    private static int totalShapes = 0;

    public static Shape createShape(String shapeType) {
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            System.out.println("Cannot create more shapes. Limit reached.");
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                if (circleCount < MAX_PER_SHAPE) {
                    circleCount++;
                    totalShapes++;
                    return new Circle();
                }
                break;

            case "square":
                if (squareCount < MAX_PER_SHAPE) {
                    squareCount++;
                    totalShapes++;
                    return new Square();
                }
                break;

            case "rectangle":
                if (rectangleCount < MAX_PER_SHAPE) {
                    rectangleCount++;
                    totalShapes++;
                    return new Rectangle();
                }
                break;
        }

        System.out.println("Cannot create more " + shapeType + " shapes. Limit reached.");
        return null;
    }
}
