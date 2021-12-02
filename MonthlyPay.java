
public class MonthlyPay{
     public static void main(String[]args){
        double witholdingtax = 0.15;
        double SSScontribution = 0.0363;
        double medicare = 0.0125;
        double pagibig = 100;
        String employee = "Jess Diaz";
        Double grosspay = 25000.0;
        double WT = witholdingtax*grosspay;
        double SSScontri = SSScontribution*grosspay;
        double MC = medicare*grosspay;
        double total = WT+SSScontri+MC+pagibig;
        double netpay = grosspay-total;
        System.out.println("Employee Name:            "+employee);
        System.out.println("Gross Pay:                "+grosspay);
        System.out.println("------------------------------------------");
        System.out.println("Deductions                Amount");
        System.out.println("Witholding tax:           "+WT);
        System.out.println("SSS Contribution:         "+SSScontri);
        System.out.println("Medicare:                 "+MC);
        System.out.println("Pagibig Contribution;     "+pagibig);
        System.out.println("------------------------------------------");
        System.out.println("Net Pay:                  "+netpay);
    }
}