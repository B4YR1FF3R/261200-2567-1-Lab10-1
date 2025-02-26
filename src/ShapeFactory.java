public class ShapeFactory {
    // ค่าที่กำหนดไว้ ห้ามทำเกินกว่านี้
    private static final int MAX_PER_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;

    // ตัวนับ
    private static int circleCount = 0;
    private static int squareCount = 0;
    private static int rectangleCount = 0;
    private static int totalShapes = 0;

    // สร้างรูปทรง
    public static Shape createShape(String shapeType) {

        // ถ้าสร้างเกิน ไม่ให้สร้าง
        if (totalShapes >= MAX_TOTAL_SHAPES) {
            System.out.println("Cannot create more shapes. Limit reached.");
            return null;
        }

        switch (shapeType.toLowerCase()) {
            // สร้างวงกลม
            case "circle":
                if (circleCount < MAX_PER_SHAPE) {
                    circleCount++;
                    totalShapes++;
                    return new Circle();
                }
                break;

            // สร้างสี่เหลี่ยม
                case "square":
                if (squareCount < MAX_PER_SHAPE) {
                    squareCount++;
                    totalShapes++;
                    return new Square();
                }
                break;

            // สร้างสามเหลี่ยม
                case "rectangle":
                if (rectangleCount < MAX_PER_SHAPE) {
                    rectangleCount++;
                    totalShapes++;
                    return new Rectangle();
                }
                break;
        }

        // สร้างเกิน ไม่ให้สร้าง
        System.out.println("Cannot create more " + shapeType + " shapes. Limit reached.");
        return null;
    }
}
