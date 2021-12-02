import java.util.Scanner;
public class MutualRecursion {
    private static Scanner input;
    public static boolean is_even(int num){
        if(num==0)
        return true;
        else 
        return is_odd(num-1);
    }
    public static boolean is_odd(int num){
        if(num==0)
        return false;
        else
        return is_even(num-1);
    }
    public static void main(String[]args){
        input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(is_even(num))
        System.out.println(num+" is an even number.");
        else
        System.out.println(num+" is an odd number.");
    }
    
}
