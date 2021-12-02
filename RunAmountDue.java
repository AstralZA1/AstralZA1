    import java.util.Scanner;
    class AmountDue{
        public void computeAmountDue(int a){
            double price = a+(a*.12);
            System.out.println("Amount due is "+price);
        }
        public void computeAmountDue(int a, int b){
            double price = (a*b)+(a*.12);
            System.out.println("Amount due is "+price);
        }
        public void computeAmountDue(int a, int b, int c){
            double price = (a*b-c)+(a*.12);
            System.out.println("Amount due is "+price);
        }
    }
public class RunAmountDue {
    private static Scanner input;

    public static void main(String[]args){
        AmountDue due = new AmountDue();
        input = new Scanner(System.in);
        System.out.println("Press any of the following then enter values separated by space:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and Quantity");
        System.out.println("3 - Price, Quantity and Discount Amount");
        int decision = input.nextInt();
        if(decision==3){
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        due.computeAmountDue(a,b,c);
    }else if(decision==2){
        int a = input.nextInt();
        int b = input.nextInt();
        due.computeAmountDue(a,b);
    }else if(decision==1){
        int a = input.nextInt();
        due.computeAmountDue(a);
    }else{
    }  
    
}
}