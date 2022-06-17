import java.util.ArrayList;

public class AnimalTest {

  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Dog("Bob"));
    animals.add(new Dog("Rex"));
    animals.add(new Cat("Gatinho"));
    animals.add(new Tiger("Tigrão"));

    ArrayList<Pet> pets = new ArrayList<Pet>();
    System.out.println("\nAnimals:");
    for (Animal animal : animals) {
      System.out.println(animal.getName());
      animal.makeSound();
      if (animal instanceof Pet) {
        pets.add((Pet) animal);
      }
    }

    System.out.println("\nPets:");
    for (Pet pet : pets) {
      pet.findOwner();
      pet.play();
    }
  }
}
