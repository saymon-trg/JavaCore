package DZ3.Task2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple(1.0);
        Apple apple2 = new Apple(1.0);
        Apple apple3 = new Apple(1.0);
        Apple apple4 = new Apple(1.0);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        Box<Apple> appleBox1 = new Box<>(apples);

        ArrayList<Apple> apples1 = new ArrayList<>();
        Apple apple5 = new Apple(1.0);
        Apple apple6 = new Apple(1.0);
        Apple apple7 = new Apple(1.0);
        Apple apple8 = new Apple(1.0);
        apples1.add(apple5);
        apples1.add(apple6);
        apples1.add(apple7);
        apples1.add(apple8);
        Box<Apple> appleBox2 = new Box<>(apples1);

        ArrayList<Orange> oranges = new ArrayList<>();
        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);
        Orange orange3 = new Orange(1.5);
        Orange orange4 = new Orange(1.5);
        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);
        oranges.add(orange4);
        Box<Orange> orangeBox1 = new Box<>(oranges);

        System.out.println("Is boxes with apple and orange mass are equal? " + appleBox1.compareBoxes(orangeBox1));
        System.out.println("Is boxes with apple mass are equal? " + appleBox1.compareBoxes(appleBox2));
        System.out.println();
        System.out.println(appleBox1.getMass() + " lb of apples in first box with apples");
        System.out.println(appleBox2.getMass() + " lb of apples in second box with apples");
        System.out.println();
        System.out.println("seconds... Move the apples to another box...");
        appleBox1.toAnotherBox(appleBox2);
        System.out.println();
        System.out.println(appleBox2.getMass() + " lb of apples in  second box after");
        System.out.println(appleBox1.getMass() + " lb of apples in  first box after");

    }
}

