package DZ3.Task2;

public class Fruit {
    private String typeOfFruit;
    private Double weight;

    public Fruit(String typeOfFruit, Double weight) {
        this.typeOfFruit = typeOfFruit;
        this.weight = weight;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    Double getWeight() {
        return weight;
    }
}
