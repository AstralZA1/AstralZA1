import java.util.Scanner;
class BloodData{
    private String bloodType;
    private String rhFactor;
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bloodType , String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    public void display(){
        System.out.println(bloodType+rhFactor+" is added to the blood bank.");
    }
    public void bloodType(String nextLine) {
    }
    public void rhFactor(String nextLine) {
    }
}
public class RunBloodData {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        BloodData bd = new BloodData();
        System.out.print("Enter blood type of patient: ");
        bd.bloodType(input.nextLine());
        System.out.print("Enter the Rhesus factor (+ or -): ");
        bd.rhFactor(input.nextLine());
        bd.display();
        String input1;
        String input2;
        System.out.print("Enter blood type of patient: ");
        input1 = input.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = input.nextLine();
        BloodData bd1 = new BloodData(input1, input2);
        bd1.display();
        }
}