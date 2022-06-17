public class Dog extends Animal implements Pet {

  public Dog(String name) {
    super(name);
  }

  public void makeSound() {
    System.out.println("Ruf, ruf!");
  }

  @Override
  public void findOwner() {
    String owner = "Luci";
    System.out.println("Dog owner is " + owner);
  }

  @Override
  public void play() {
    System.out.println(toString() + " " + "is playing...");
  }

  @Override
  public String toString() {
    return "Dog " + getName();
  }
}
