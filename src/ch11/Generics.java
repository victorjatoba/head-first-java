import java.util.ArrayList;
import java.util.List;

public class Generics {

  public static void main(String[] args) {
    takeAnimals(new ArrayList<Animal>());
    // takeDogs(new ArrayList<Animal>());
    // takeAnimals(new ArrayList<Dog>());
    takeDogs(new ArrayList<>());
    takeSomeAnimal(new ArrayList<>());
    takeSomeAnimal(new ArrayList<Dog>());
    takeSomeAnimal(new ArrayList<Animal>());
    // List<Animal> animals = new List<Animal>();
    // takeObjects(new ArrayList<Animal>());
    // takeObjects(new ArrayList<Dog>());
    takeObjects(new ArrayList<>());
    takeObjects(new ArrayList<Object>());
    List<Object> objects = new ArrayList<>();
    takeObjects(objects);
  }

  private static void takeDogs(List<Dog> dogs) {
    System.out.println(dogs);
  }

  private static void takeAnimals(List<Animal> animals) {
    System.out.println(animals);
  }

  private static void takeSomeAnimal(List<? extends Animal> animals) {
    System.out.println(animals);
  }

  private static void takeObjects(List<Object> objects) {
    System.out.println(objects);
  }
}

abstract class Animal {

  void eat() {
    System.out.println("animal eating");
  }
}

class Dog extends Animal {

  void bark() {}
}

class Cat extends Animal {

  void meow() {}
}
