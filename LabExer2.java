    import java.util.Scanner;
class Purchase{
        private String itemName;
        private double itemPrice;
        private int itemQuantity;
        private double amountDue;   
        Scanner input = new Scanner(System.in);
    public void setItemName(String itemName){
                this.itemName = itemName;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public double setAmountDue(double amountDue) {
        this.amountDue = amountDue;
        return amountDue;
    }
    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }
    public void setItemQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    public void setTotalCost(int itemQuantity, double itemPrice){
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
    public String getItemName(){
        return itemName;
    }
    public double getItemPrice(){
        return itemPrice;
    }
    public int getItemQuantity(){
        return itemQuantity;
    }
    public double getTotalCost(){
        return setAmountDue(itemQuantity*itemPrice);
    }
    public void readInput(){
        System.out.println("Enter the namme of the item you are purchasing:");
        setItemName(input.nextLine());
        System.out.println("Enter the Quantity and price separated by a space:");
        setItemQuantity(input.nextInt()); setItemPrice(input.nextDouble());
    }
    public void readOutput(){
        System.out.println("You are purchasing: "+ getItemQuantity()+" "+getItemName()+"(s)"+ " at "+String.format("%.2f",getItemPrice())+" each.");
        System.out.println("Amount Due is: "+String.format("%.2f", getTotalCost()));
    }
  }
public class LabExer2{
    public static void main(String[]args){
        Purchase purch1 = new Purchase();
        purch1.readInput();
        purch1.readOutput();
    }
}

