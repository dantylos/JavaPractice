import static java.lang.Math.*;

public class lecture4 {
    public static void main(String[] args) {
        System.out.println(calculateFormulaStatic(3, 4, 12, 2));
        lecture4 m = new lecture4();
        System.out.println(m.calculateFormula(3, 4, 12, 2));

        // Testing of the Cuboid class:
        Cuboid cuboid = new Cuboid(2, 2,2);
        System.out.println(cuboid.calculateVolume());
        System.out.println(cuboid.calculateSurface());
        System.out.println(cuboid.calculateAllEdgesLength());
        System.out.println(cuboid.calculateDiagonal());

        // Testing of the Coord class
        Coord coord = new Coord(2,2);
        System.out.println(coord.getX());
        System.out.println(coord.getY());
        coord.print();
        coord.moveUp();
        coord.print();
        coord.moveDown();
        coord.print();
        coord.moveLeft();
        coord.print();
        coord.moveRight();
        coord.print();
        System.out.println(coord.calculateDistanceFromOrigin());

        Coord c1 = new Coord(3, 3);
        c1.print();
        System.out.println(coord.calculateDistanceFrom(c1));

        // Testing of the Triangle class
        Triangle triangle = new Triangle(new Coord(1,1), new Coord(1, 2), new Coord(2, 1));
        triangle.print();
        triangle.moveUp();
        triangle.print();
        triangle.moveDown();
        triangle.print();
        triangle.moveRight();
        triangle.print();
        triangle.moveLeft();

        triangle.calculateCircumference();
        triangle.calculateContent();

    }

    static double calculateFormulaStatic(double a, double b, double c, double d){
        return (a/(b*c+d)) / (a*(c+d));
    }

    double calculateFormula(double a, double b, double c, double d){
        return (a/(b*c+d)) / (a*(c+d));
    }
}

class Cuboid {
    double a;
    double b;
    double c;

    Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateVolume(){
        return a * b * c;
    }

    double calculateSurface(){
        return 2 * (a * a + b * b + c * c);
    }

    double calculateAllEdgesLength(){
        return 4 * (a + b + c);
    }

    double calculateDiagonal(){
        return sqrt(a*a + b*b + c*c);
    }
}

class Coord {
    double x;
    double y;

    Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }


    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void moveUp() {
        y++;
    }

    void moveDown() {
        y--;
    }

    void moveLeft() {
        x--;
    }

    void moveRight() {
        x++;
    }

    double calculateDistanceFromOrigin() {
        return sqrt(x * x + y * y);
    }

    double calculateDistanceFrom(Coord other) {
        return sqrt(pow(other.x - x, 2) + pow(other.y - y, 2));
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Triangle {
    Coord c1;
    Coord c2;
    Coord c3;

    Triangle(Coord c1, Coord c2, Coord c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }


    public void print() {
        System.out.println("-----");
        c1.print();
        c2.print();
        c3.print();
        System.out.println("-----");
    }

    void moveUp() {
        c1.moveUp();
        c2.moveUp();
        c3.moveUp();
    }

    public void moveDown() {
        c1.moveDown();
        c2.moveDown();
        c3.moveDown();
    }

    public void moveRight() {
        c1.moveRight();
        c2.moveRight();
        c3.moveRight();
    }

    public void moveLeft() {
        c1.moveLeft();
        c2.moveLeft();
        c3.moveLeft();
    }

    public void calculateCircumference() {
        c1.calculateDistanceFrom(c2);
        c2.calculateDistanceFrom(c3);
        c3.calculateDistanceFrom(c1);
    }


    public void calculateContent() {
    }
}