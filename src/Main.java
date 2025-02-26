public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("circle");
        Shape shape2 = ShapeFactory.createShape("circle");
        Shape shape3 = ShapeFactory.createShape("square");
        Shape shape4 = ShapeFactory.createShape("square");
        Shape shape5 = ShapeFactory.createShape("rectangle");

        // ลองสร้างรูปทรงเกินขีดจำกัด
        Shape shape6 = ShapeFactory.createShape("rectangle");
        Shape shape7 = ShapeFactory.createShape("circle");

        // วาดรูปทรงที่สร้างสำเร็จ
        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
        if (shape3 != null) shape3.draw();
        if (shape4 != null) shape4.draw();
        if (shape5 != null) shape5.draw();
    }
}