package dom13;

import sun.security.krb5.internal.PAEncTSEnc;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends Point {

    private Point upPoint;
    private Point downPoint;

    public Rectangle(int coordinateX, int coordinateY, 
            Point upPoint, Point downPoint) {
        super(coordinateX, coordinateY);
        setUpPoint(downPoint);
        setDownPoint(downPoint);
    }

    public Rectangle() {
        this(0, 0, new Point(0, 0), new Point(0, 0));
    }

    public Rectangle(Rectangle copyRectanglef) {
        //super(copyRectangle);
        this(copyRectanglef.getCoordinateX(), 
                copyRectanglef.getCoordinateY(),
                copyRectanglef.getUpPoint(), 
                copyRectanglef.getDownPoint());

    }

    public void setUpPoint(Point newUpPoint) {
        if (newUpPoint == null) {
            newUpPoint = new Point(0, 0);
            upPoint = new Point(newUpPoint);
        } else {
            upPoint = new Point(newUpPoint);
        }
    }

    public Point getUpPoint() {
        Point newPoint = new Point(upPoint);
        return newPoint;
    }

    public void setDownPoint(Point newDownPoint) {
        if (newDownPoint == null) {
            newDownPoint = new Point(0, 0);
            downPoint = new Point(newDownPoint);
        } else {
            downPoint = new Point(newDownPoint);
        }
    }
    public Point getDownPoint() {
        Point newPoint = new Point(downPoint);
        return newPoint;
    }
    @Override
    public String toString() {
        return String.format("%s (%d, %d), (%d, %d)", super.toString(),
                upPoint.getCoordinateX(), upPoint.getCoordinateY(),
                downPoint.getCoordinateX(), downPoint.getCoordinateY());
    }

    public double diagonal() {
        double result;
        result = Math.sqrt(Math.pow
                (upPoint.getCoordinateX() - downPoint.getCoordinateX(), 2)
                + Math.pow
                (upPoint.getCoordinateY() - downPoint.getCoordinateY(), 2));
        return result;
    }
}
