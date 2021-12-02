import java.util.Scanner;
class Person{
    private String name;
    private String contactNum;
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setContactNum(String c){
        this.contactNum = c;
    }
    public String getContactNum(){
        return contactNum;
    }
}
class Employee extends Person{
    private double salary;
    private String department;
    public void setSalary(double s){
        this.salary = s;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String d){
        this.department = d;
    }
    public String getDepartment(){
        return department;
    }
}
class Student extends Person{
    private String program;
    private int yearLevel;
    public void setProgram(String p){
        this.program = p;
    }
    public String getProgram(){
        return program;
    }
    public void setYearLevel(int y){
        this.yearLevel = y;
    }
    public int getYearLevel(){
        return yearLevel;
    }
}
class Faculty extends Employee{
    private boolean status;
    public boolean isRegular(){
        System.out.println("Status: Regular");
        return status;
    }
}
public class Collegelist {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        Employee e = new Employee();
        Student s = new Student();
        Faculty f = new Faculty();
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String identity = input.nextLine();
        if(identity.equalsIgnoreCase("E")){
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Press enter after every input.");
            e.setName(input.nextLine());
            e.setContactNum(input.next());
            e.setSalary(input.nextDouble());
            e.setDepartment(input.next());
            System.out.println("----------------------------------------------");
            System.out.println("Name: "+e.getName());
            System.out.println("Contact Number: "+e.getContactNum());
            System.out.println("Salary: "+e.getSalary());
            System.out.println("Department: "+e.getDepartment());
        }else if(identity.equalsIgnoreCase("S")){
            System.out.println("Type student's name, contact number, enrolled program, and year level.");
            System.out.println("Press enter after every input.");
            s.setName(input.nextLine());
            s.setContactNum(input.next());
            s.setProgram(input.next());
            s.setYearLevel(input.nextInt());
            System.out.println("----------------------------------------------");
            System.out.println("Student Name: "+s.getName());
            System.out.println("Contact Number: "+s.getContactNum());
            System.out.println("Enrolled Program: "+s.getProgram());
            System.out.println("Year Level: "+s.getYearLevel());
        }else if(identity.equalsIgnoreCase("F")){
            System.out.println("Press Y if regular or N if not");
            String regular = input.nextLine();
            if(regular.equalsIgnoreCase("Y")){
            System.out.println("Type Faculty's name, contact number, salary, department, and status.");
            System.out.println("Press enter after every input.");
            f.setName(input.nextLine());
            f.setContactNum(input.next());
            f.setSalary(input.nextDouble());
            f.setDepartment(input.next());
            System.out.println("----------------------------------------------");
            System.out.println("Name: "+f.getName());
            System.out.println("Contact Number: "+f.getContactNum());
            System.out.println("Salary: "+f.getSalary());
            System.out.println("Department: "+f.getDepartment());
            f.isRegular();
        }else if(regular.equalsIgnoreCase("N")){
            System.out.println("Type Faculty's name, contact number, salary, department, and status.");
            System.out.println("Press enter after every input.");
            f.setName(input.nextLine());
            f.setContactNum(input.next());
            f.setSalary(input.nextDouble());
            f.setDepartment(input.next());
            System.out.println("----------------------------------------------");
            System.out.println("Name: "+f.getName());
            System.out.println("Contact Number: "+f.getContactNum());
            System.out.println("Salary: "+f.getSalary());
            System.out.println("Department: "+f.getDepartment());
            System.out.println("Status: Not Regular");
        }
            }
    }
}
