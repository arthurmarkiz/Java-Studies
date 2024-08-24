package OOP.Exercises;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    private double perimeter() {
        return (width * 2) + (height * 2);
    }
    private double area() {
        return width * height;
    }
    private double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    public void recInfos() {
        double recPerimeter = perimeter();
        double recArea = area();
        double recDiagonal = diagonal();
        System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", recArea, recPerimeter, recDiagonal);
    }
}
