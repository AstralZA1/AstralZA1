import java.util.Scanner;
public class Percentage {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        System.out.print("Enter the number of males: ");
        int males = input.nextInt();
        System.out.print("Enter the number of females: ");
        int females = input.nextInt();
        int totalStudents = males+females;
        System.out.print("Number of students = "+totalStudents);
        System.out.println("");
        double percentmale = (males/(double)totalStudents)*100;
        System.out.println("Male = "+String.format("%.2f", percentmale)+"%");
        double percentfemale = females/(double)totalStudents*100;
        System.out.println("Female = "+String.format("%.2f", percentfemale)+"%");
    }
}
