public class Main {
    public static void main(String[] args) {

        // ลองสร้างรูปทรงต่างๆ
        Shape shape1 = ShapeFactory.createShape("circle");
        Shape shape2 = ShapeFactory.createShape("circle");
        Shape shape3 = ShapeFactory.createShape("square");
        Shape shape4 = ShapeFactory.createShape("square");
        Shape shape5 = ShapeFactory.createShape("rectangle");

        // ลองสร้างรูปทรงเกินกำหนด
        Shape shape6 = ShapeFactory.createShape("rectangle");
        Shape shape7 = ShapeFactory.createShape("circle");

        // ลองสร้างรูปทรงที่สร้างได้
        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
        if (shape3 != null) shape3.draw();
        if (shape4 != null) shape4.draw();
        if (shape5 != null) shape5.draw();
    }
}