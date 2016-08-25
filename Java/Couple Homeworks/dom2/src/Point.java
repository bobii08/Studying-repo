package dom14;

/**
 *
 * @author LENOVO
 */
public class Point extends HeavyElement {

    double coordX;
    double coordinateY;

    public Point(double weight, double newCoordinateX, double newCoordinateY) {
        super(weight);
        setCoordX(newCoordinateX);
        setCoordinateY(newCoordinateY);
    }

    public Point() {
        this(0.0, 0, 0);
    }

    public Point(Point copyPoint) {
        this(copyPoint.getWeight(), copyPoint.getCoordX(),
                copyPoint.getCoordinateY());
    }

    public void setCoordX(double newCoordinateX) {
        if (newCoordinateX < 0) {
            coordX = 0;
        } else {
            coordX = newCoordinateX;
        }
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordinateY(double newCoordinateY) {
        if (newCoordinateY < 0) {
            coordinateY = 0;
        } else {
            coordinateY = 0;
        }
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public String toString() {
        return String.format("Weight: %.2f\n(%.2f, %.2f)", getWeight(),
                getCoordX(), getCoordinateY());
    }
    @Override
    public double calcWeight() {
        this.setWeight(getWeight());
        return this.getWeight();
    }
}
