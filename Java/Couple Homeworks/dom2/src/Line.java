package dom14;

/**
 *
 * @author LENOVO
 */
public class Line extends Point {

    Point ePoint;

    public Line(double weight, double coordinateX,
            double coordinateY, Point newEPoint) {
        super(weight, coordinateX, coordinateY);
        setEPoint(newEPoint);
    }

    public Line() {
        this(0.0, 0.0, 0.0, new Point(0, 0, 0));
    }
    public Line(Line copyLine) {
        this(copyLine.getWeight(), copyLine.getCoordX(),
                copyLine.getCoordinateY(), copyLine.getEPoint());
    }
    public void setEPoint(Point newEPoint) {
        if (newEPoint == null) {
            newEPoint = new Point(0, 0, 0);
            ePoint = new Point(newEPoint);
        } else {
            ePoint = new Point(newEPoint);
        }
    }
    public Point getEPoint() {
        Point copyEPoint = new Point(ePoint);
        return copyEPoint;
    }

    public String toString() {
        return String.format("%s (%.2f, %.2f)",
                super.toString(), ePoint.getCoordX(),
                ePoint.getCoordinateY());
    }
    public double calcWeight() {
        double result;
        result = (Math.sqrt(Math.pow(ePoint.getCoordX() - super.getCoordX(), 2)
              + Math.pow(ePoint.getCoordinateY() - super.getCoordinateY(), 2)))
                * ((super.getWeight() + ePoint.getWeight()) / 2);
        return result;
    }
}
