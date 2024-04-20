import java.util.Scanner;
import java.util.Random;
  

class Animal {
  //defines attributes and assigns values
  private String prefferedFood;
  private String prefferedEnvironment;
  private String name;

  public Animal(String name, String prefferedFood, String prefferedEnvironment) {
    this.name = name;
    this.prefferedFood = prefferedFood;
    this.prefferedEnvironment = prefferedEnvironment;
  }

  //returns attribute values
  public String getName() {
    return name;
  }

  public String getPrefferedFood() {
    return prefferedFood;
  }

  public String getPrefferedEnvironment() {
    return prefferedEnvironment;
  }

  public void printInfo() {
    System.out.println("Animal Name: " + name);
    System.out.println("Preffered Food: " + prefferedFood);
    System.out.println("Preffered Environment: " + prefferedEnvironment);
  }

  //returns an action that the animal completes
  private String walk() {
    return "Current Activity: The " + name + " is walking.";
  }

  private String eat() {
    return "Current Activity: The " + name + " is eating some " + prefferedFood + ".";
  }

  private String sleep() {
    return "Current Activity: The " + name + " is sleeping.";
  }

  private String makeNoise() {
    return "Current Activity: The " + name + " is making a noise.";
  }

  private String roam() {
    return "Current Activity: lionThe " + name + " is roaming.";
  }

  //returns a random action that the animal can complete
  public void performAction(int actionNumber) {
    switch (actionNumber) {
      case 0:
        System.out.println(walk());
        break;
        
      case 1:
        System.out.println(eat());
        break;
      
      case 2:
        System.out.println(sleep());
        break;

      case 3:
        System.out.println(makeNoise());
        break;

      case 4:
        System.out.println(roam());
    }
  }
}

public class Main {
  public static void main(String[] args) {
    //creates 7 animal objects
    String[] animals = {"giraffe", "zebra", "lion", "tiger", "bear", "elephant", "gorilla"};
    Animal giraffe = new Animal(animals[0], "leaves", "savannah");
    Animal zebra = new Animal(animals[1], "grass", "grasslands");
    Animal lion = new Animal(animals[2], "meat", "savannah");
    Animal tiger = new Animal(animals[3], "meat", "savannah");
    Animal bear = new Animal(animals[4], "meat", "forest");
    Animal elephant = new Animal(animals[5], "grass", "savannah");
    Animal gorilla = new Animal(animals[6], "fruit", "forest");
    Animal[] animalObjects = {giraffe, zebra, lion, tiger, bear, elephant, gorilla};

    //user chooses an animal
    System.out.println("Welcome to the zoo! Here are the animals we have:");
    for (String i: animals) {
      System.out.println(i);
    }
    System.out.print("Which animal would you like to know about: ");
    Scanner sc = new Scanner(System.in);
    String chosenAnimal = sc.nextLine();

    //prints all information about the animal
    System.out.println("Here is all the information about the " + chosenAnimal + ": ");
    int index = 0;
    for (String i: animals) {
      if (i.equals(chosenAnimal)) {
        animalObjects[index].printInfo();
        Random rand = new Random();
        int actionNumber = rand.nextInt(5);
        animalObjects[index].performAction(actionNumber);
      }
      index++;
    } 
  }
}