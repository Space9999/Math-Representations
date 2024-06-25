package Geometry.Polygons;

public class regularPolygon {
    
    private int sides;
    private double sideLength;

    public Polygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public Polygon(int sides) {
        this.sides = sides;
        sideLength = 1; // Default is 1
    }

    public Polygon(double sideLength) {
        this.sideLength = sideLength;
        sides = 1; // Default is 1
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getLength() {
        return sideLength;
    }

    public void setLength(double length) {
        sideLength = length;
    }

    public double getPerimeter() {
        return sideLength * sides;
    }

    public double getApothem() {
        return sideLength / (2 * Math.toDegrees(Math.tan(180 / sides)));
    }
    
    public double getArea() {
        return 0.5 * getApothem() * getPerimeter();
    }

}
