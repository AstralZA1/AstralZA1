import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
public class StackofBooks {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        Stack<String> booktitle = new Stack<>();
        Queue<String> queueofbooks = new LinkedList<>();
        System.out.println("Enter four book titles.");
        for(int i=1;i<=4;i++){
            System.out.printf("Book %d : ",i);
            String book = input.nextLine();
            booktitle.push(book);
        }
        while(!booktitle.isEmpty()){
            String bookqueue = booktitle.pop();
            queueofbooks.offer(bookqueue);
        }
        System.out.println("New order of books:");
        System.out.println(queueofbooks);
    }
    
}
