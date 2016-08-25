
package dom13;

/**
 *
 * @author LENOVO
 */
public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        setCoordinateX(coordinateX);
        setCoordinateY(coordinateY);
    }

    public Point() {
        this(0, 0);
    }

    public Point(Point copyPoint) {
        this(copyPoint.getCoordinateX(), 
                copyPoint.getCoordinateY());
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        if (coordinateX < 0) {
            this.coordinateX = 0;
        } else {
            this.coordinateX = coordinateX;
        }
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        if (coordinateY < 0) {
            this.coordinateY = 0;
        } else {
            this.coordinateY = coordinateY;
        }
    }

    public String toString() {
        String format = String.format("(%d, %d)", 
                getCoordinateX(), getCoordinateY());
        return format;
    }
}
