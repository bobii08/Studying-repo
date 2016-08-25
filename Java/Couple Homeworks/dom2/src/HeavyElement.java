package dom14;

/**
 *
 * @author LENOVO
 */
public abstract class HeavyElement {

    double weight;

    public HeavyElement(double newWeight) {
        setWeight(newWeight);
    }

    public HeavyElement() {
        this(0.0);
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0.0) {
            newWeight = 0.0;
            weight = newWeight;
        }
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double calcWeight();
}
