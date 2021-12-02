import java.util.Scanner;
public class Reversenum {
   
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int i = 0;
    int sum = 0;
    int arr[] = new int[5];
    int reverse[] = new int [5];
    System.out.println("ENTER FIVE INTEGERS:");
    for(int n=0;n<5;n++){
        arr[n] = input.nextInt();
        sum = sum + arr[n];
    }
    System.out.println("THE FIVE INTGERS ARE:");
    for(int n=0;n<5;n++){
        System.out.print(arr[n]+" ");
    }
    System.out.println("");
    System.out.println("THE SUM OF NUMBERS IS:"+sum);
    System.out.println("THE NUMBERS IN THE REVERSE ORDER ARE:");
    for(int n=5;n>0;n--,i++){
        reverse[i]=arr[n-1];
        System.out.print(reverse[i]+" ");
    }
}
}