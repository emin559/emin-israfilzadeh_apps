package app.Animal;

public class Cat extends Animal {

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I am cat, my name is " + name;
  }
}
