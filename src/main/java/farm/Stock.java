package farm;

import animals.*;

import java.util.ArrayList;

public class Stock {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(Animal.COW + " Маша");
        AnimalFarm farm = new AnimalFarm(animals);

        farm.addAnimal("Глафира");
        farm.addAnimal(Animal.CAT);
        farm.addAnimal(Animal.COW, "Георгий");
        farm.addAnimal(Animal.HORSE, "Плотва");

        System.out.println("Животные на ферме:\n" + farm.toString());

        System.out.println("Виды животных и их количество:\n" + farm.countedAnimals());
        System.out.println("Уникальные имена:\n" + farm.uniqueNames());
    }
}
