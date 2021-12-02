import java.util.Scanner;
public class HelloName {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        System.out.println("Input your name:");
        String name = input.nextLine();
        System.out.println("Hello "+name +"!");
    }
    
}
