import java.util.ArrayList;

public class AnimalTest {

  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Dog("Bob"));
    animals.add(new Dog("Rex"));
    animals.add(new Cat("Gatinho"));
    animals.add(new Tiger("Tigrão"));

    for (Animal animal : animals) {
      System.out.println(animal.getName());
      animal.makeSound();
    }
  }
}
