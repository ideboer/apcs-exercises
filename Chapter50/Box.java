public class Box {

    private double width;
    private double height;
    private double length;

    public Box( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box( Box oldBox ) {
        this.length = oldBox.getLength();
        this.width = oldBox.getWidth();
        this.height = oldBox.getHeight();
    }

    public Box biggerBox( Box oldBox) {
        return new Box( 1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
    }

    public Box smallerBox( Box oldBox) {
        return new Box( .75 * oldBox.getWidth(), .75 * oldBox.getHeight(), .75 * oldBox.getLength());
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return (2 * topArea()) + (2 * faceArea()) + (2 * sideArea());
    }

    public double topArea() {
        return width * length;
    }

    public double faceArea() {
        return height * length;
    }

    public double sideArea() {
        return width * height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getTopArea() {
        return topArea();
    }

    public double getFaceArea() {
        return faceArea();
    }

    public double getSideArea() {
        return sideArea();
    }

    public boolean nests( Box outsideBox) {
        if ( height < outsideBox.getHeight() && width < outsideBox.getWidth() && length < outsideBox.getLength() ) {
            return true;
        }
        return false;

    }
}