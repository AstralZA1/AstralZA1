import java.util.Scanner;
class Employee{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    public double getMontlySalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    private double ratePerHour;
    private int hoursWorked;
    public double wage;
    public double setWage(double wage){
        return this.wage = wage;
    }
    public double getWage(){
        return setWage(hoursWorked*ratePerHour);
    }
    public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    public double getRatePerHour(){
        return ratePerHour;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
}
public class RunEmployee {
    private static Scanner input;
    public static void main(String[]args){
        input = new Scanner(System.in);
        FullTimeEmployee FTE = new FullTimeEmployee();
        Employee employ = new Employee();
        PartTimeEmployee PTE = new PartTimeEmployee();
        System.out.println("Enter name: ");
        employ.setName(input.nextLine());
        System.out.println("Press F for Full time or P for Part Time");
        String Decision = input.nextLine();
        if(Decision.equals("F")||Decision.equals("f")){
            System.out.println("Enter monthly Salary:");
            FTE.setMonthlySalary(input.nextDouble());
            System.out.println("Name: "+employ.getName());
            System.out.println("Wage: "+String.format("%.2f",FTE.getMontlySalary()));
        }else if(Decision.equals("P")||Decision.equals("p")){
            System.out.println("Enter rate per hour and no. of hours separated by space:");
            System.out.println("Sample: 107.50 13");
            PTE.setRatePerHour(input.nextDouble()); PTE.setHoursWorked(input.nextInt());
            System.out.println("Name: "+employ.getName());
            System.out.println("Wage: "+String.format("%.2f",PTE.getWage()));
        }
    }
    
}
