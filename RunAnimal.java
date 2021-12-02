import java.util.Scanner;
    abstract class Animal{
        public abstract void eat();
        public abstract void sleep();
        public abstract void makeSound();
    }
    class Bird extends Animal{
        public void makeSound(){
            System.out.println("Tweet Tweet");
        }
        public void eat(){
            System.out.print("Birds love to eat seeds and ");
        }
        public void sleep(){
            System.out.println("sleep for 10-12 hours a day.");
        }
    }
    class Dog extends Animal{   
        public void makeSound(){
            System.out.println("Arf Arf");
        }
        public void eat(){
            System.out.print("Dogs love to eat bones and ");
        }
        public void sleep(){
            System.out.println("sleep for 12-14 hours a day.");
        }
    } 
    class Cat extends Animal{
        public void makeSound(){
            System.out.println("Meow Meow");
        }
        public void eat(){
            System.out.print("Cats love to eat fish and ");
        }
        public void sleep(){
            System.out.println("sleep for 12-16 hours a day.");
        }
    }
public class RunAnimal {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        Animal animal;
        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("B")){
            animal = new Bird();
            animal.eat();
            animal.sleep();
            animal.makeSound();
        }else if(choice.equalsIgnoreCase("C")){
            animal = new Cat();
            animal.eat();
            animal.sleep();
            animal.makeSound();
        }else if(choice.equalsIgnoreCase("D")){
            animal = new Dog();
            animal.eat();
            animal.sleep();
            animal.makeSound();
        }else{
            System.out.println("Wrong input!");
        }
    } 
}
