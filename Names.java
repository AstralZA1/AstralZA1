import java.util.Scanner;
public class Names {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 10;
        String name2;
        String names [] = new String[num];
        System.out.println("ENTER STUDENT NAME:");
        for(int n=0;n<num;n++){
            names[n]= input.nextLine();
        }
        for(int n=0;n<num;n++){
            for(int i=n+1;i<num;i++){
                if(names[n].compareTo(names[i])>0){
                    name2=names[n];
                    names[n]=names[i];
                    names[i]=name2;
                }
            }
        }
        System.out.println("THE NAMES IN ALPHABETICAL ORDER:");
        for(int n=0;n<num-1;n++){
            System.out.println(names[n]);
        }
        System.out.println(names[num-1]);
    }
}
