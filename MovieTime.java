import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class MovieTime {
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();
        for(int i=1;i<=3;i++){
            System.out.printf("Enter movie %d of 3: ", i);
            movies.offer(input.nextLine());
        }
        for(int i =1;i<=3;i++){
            System.out.printf("Enter snack %d of 3: ",i);
            snacks.offer(input.nextLine());
        }
        System.out.println("Movies to watch are: deque("+movies+")");
        System.out.println(("Snacks available are: deque("+snacks+")"));
        System.out.println("Press S each time you finish a snack.");
        for(int i=0;i<3;){
            String eat = input.nextLine();
            if(eat.equalsIgnoreCase("S")){
                snacks.poll();
                if(snacks.isEmpty()){
                    System.out.println("No more snacks");
                }else{
                    System.out.println("deque("+snacks+")");
                }
                i++;
            }
        }
    }
}
