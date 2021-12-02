import java.util.Scanner;
class SavingsAccount{
    Scanner input = new Scanner(System.in);
    private double interestRate;
    private double depositAmount;
    private double balance;
    private double amount;
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public double getIntrestRate(){
        return interestRate;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    public double setBalance(double balance){
        this.balance = balance;
        return balance;
    }
    public double getBalance(){
        return setBalance(balance+depositAmount);
    }
    public void withdraw(){
        balance = balance+(balance*interestRate) - amount;
    }
    public void deposit(){
        balance = balance+(balance*interestRate)+amount+(amount*interestRate);
    }
    public void account1(){
        System.out.print("Enter interest rate: ");
        setInterestRate(input.nextDouble());
        System.out.print("Enter deposit amount: ");
        setDepositAmount(input.nextDouble());
        System.out.print("Your balance is: "+String.format("%.2f", getBalance()));
    }
    public void account2(){
        System.out.println("");
        System.out.print("Press D for another deposit or W to withdraw: ");
        String decision = input.next();
        if(decision.equals("d")){
            System.out.print("Enter deposit amount: ");
            setAmount(input.nextDouble());
            deposit();
            System.out.print("Your new balance is:"+String.format("%.2f", balance));
        }else if(decision.equals("w")){
            System.out.print("Enter withdraw amount: ");
            setAmount(input.nextDouble());
            withdraw();
            System.out.print("Your new balance is: "+String.format("%.2f", balance));
        }else{
            System.out.println("Invalid input");
        }
    }
}
    public class RunSavingsAccount{
        public static void main(String[]args){
            SavingsAccount account = new SavingsAccount();
            account.account1();
            account.account2();
        }
    }

