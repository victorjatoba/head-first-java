public class Cat extends Feline implements Pet {

  public Cat(String name) {
    super(name);
  }

  public void makeSound() {
    System.out.println("Miauu!");
  }

  @Override
  public void findOwner() {
    String owner = "Adilson";
    System.out.println("Cat owner is " + owner);
  }

  @Override
  public void play() {
    System.out.println("Cat playing...");
  }
}
