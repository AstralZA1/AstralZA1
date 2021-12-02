import java.util.Scanner;
import java.util.Stack;
public class FruitBasket {
    private static Scanner input;
        public static void main(String[]args){
        input = new Scanner(System.in);
        Stack<String> basket = new Stack<>();
        System.out.println("Catch and eat any of these fruits: ('apple', 'orange', 'mango', 'guava')");
        System.out.print("How many fruits would you like to catch? ");
        int basketsize = input.nextInt();
        System.out.println("Choose a fruit to catch. Press A, O, M or G.");
        for(int i=0;i<=basketsize;i++){
        String fruit = input.nextLine();
        System.out.print("Fruit "+i + " of " + basketsize + " : ");
        if(fruit.equalsIgnoreCase("A")){
            String A = "'apple'";
            basket.push(A);
        }else if(fruit.equalsIgnoreCase("O")){
            String O = "'orange'";
            basket.push(O);
        }else if(fruit.equalsIgnoreCase("M")){
            String M = "'mango'";
            basket.push(M);
        }else if(fruit.equalsIgnoreCase("G")){
            String G = "'guava'";
            basket.push(G);
        }else{
    }
        }
        System.out.println("");
        System.out.println("Your basket now has: "+basket);
        while(!basket.isEmpty()){
            System.out.print("Press E to eat a fruit. ");
            String eat = input.nextLine();
            if(eat.equalsIgnoreCase("E")){
                basket.pop();
                System.out.println("Fruit(s) in the basket: "+basket);
            }else{
                System.out.println("Invalid Action!");
            }
        }
        System.out.println("No more fruits.");
    }
}
