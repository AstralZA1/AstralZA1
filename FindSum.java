import java.util.Scanner;
public class FindSum {
    private static Scanner input;
    public static int find_sum(int n){
        if(n!=0){
            return n + find_sum(n-1);
        }else
        return n;
    }
    public static void main(String[]args){
        input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        int sum = find_sum(num);
        System.out.println("The sum of the first "+num +" integers is "+ sum);
    }
}
