package DZ3.Task2;

import java.util.ArrayList;
import java.util.Objects;

public class Box <T extends Fruit> {
    ArrayList<T> fruitsInside;

    public Box(ArrayList<T> fruitsInside) {
        this.fruitsInside = fruitsInside;
    }

    public ArrayList<T> getFruitsInside() {
        return fruitsInside;
    }

    public Double getMass() {
        Double totalMass = 0.0;
        for (T t : getFruitsInside()) {
            if (t != null) {
                Double weight = t.getWeight();
                totalMass = weight + totalMass;
            }
        }
        return totalMass;
    }

    public Boolean compareBoxes(Box<? extends Fruit> box) {
        return (Objects.equals(this.getMass(), box.getMass()));
    }

    public void toAnotherBox(Box<T> box) {

        for (T t : box.getFruitsInside()) {
            this.getFruitsInside().add(t);
        }
        box.getFruitsInside().clear();
    }
}