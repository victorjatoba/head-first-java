public abstract class Animal {

  boolean alive;
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void eat() {
    System.out.println("General eating...");
  }

  public void makeSound() {
    System.out.println("General sound!");
  }
}
