package animals;

import java.util.*;

public class AnimalFarm {
    private ArrayList<String> farmAnimals; // Список животных на ферме в формате: Вид_животного Имя_животного

    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public HashMap<Animal, Integer> countedAnimals() {
        HashMap<Animal, Integer> animalsAtFarm = new HashMap<>();

        for (String animalNote: this.farmAnimals) {
            try {
                Animal animalType = Animal.valueOf(animalNote.split(" ")[0].toUpperCase());
                int count = animalsAtFarm.containsKey(animalType) ?
                        animalsAtFarm.get(animalType) + 1:
                        1;
                animalsAtFarm.put(animalType, count);
            } catch (NoSuchElementException e) {
                System.out.println("Please correct string [" + e.getMessage() + "]. Incorrect input data.");
            }
        }

        return animalsAtFarm;
    }

    public HashSet<String> uniqueNames() {
        HashSet<String> uniqNames = new HashSet<>();

        for (String animalNote: this.farmAnimals) {
            try {
                uniqNames.add(animalNote.split(" ")[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please correct string [" + e.getMessage() + "]. Incorrect input data.");
            }
        }

        return uniqNames;
    }

    public void addAnimal(Animal animalType, String name) {
        this.farmAnimals.add(animalType.toString() + " " + name);
    }

    public void addAnimal(Animal animalType) {
        this.farmAnimals.add(animalType.toString() + " N");
    }

    public void addAnimal(String name) {
        this.farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

    @Override
    public String toString() {
        String outputString = "";
        for (String animalNote: this.farmAnimals) {
            outputString = outputString.concat(animalNote + "\n");
        }
        return outputString;
    }
}
