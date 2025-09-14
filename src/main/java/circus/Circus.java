package circus;

import circus.stuff.Equipment;
import circus.stuff.Cannon;
import circus.stuff.Ladder;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.animal.Tiger;
import circus.animal.Elephant;

import java.util.ArrayList;
import java.util.Arrays;


public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("NUmber of animals in the circus: " + animals.length);

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));

//        printAllAnimals(animalArrayList);
//        printCircusSize(animalArrayList);
        animalArrayList.add(new Duck("Scrooge"));

//        printAllAnimals(animalArrayList);
//        printCircusSize(animalArrayList);

        Elephant strongOne = new Elephant("Tim");
        animalArrayList.add(strongOne);
//        printAllAnimals(animalArrayList);
//        printCircusSize(animalArrayList);

        System.out.println("strongOne is in position: " + animalArrayList.indexOf(strongOne));
//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));

        System.out.println("Before sorting: ");
        printAllAnimals(animalArrayList);
        animalArrayList.sort(Animal.animalNameComparator);
        System.out.println("After sorting: ");
        printAllAnimals(animalArrayList);
    }

    private static void printCircusSize(ArrayList<Animal> animalArrayList) {
        System.out.println("Number of animals in the circus: " + animalArrayList.size());
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal a : animalArrayList) {
            System.out.println(a);
        }
    }
}
