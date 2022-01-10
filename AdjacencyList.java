import java.util.ArrayList;
public class AdjacencyList{
    public static void main(String[]args){
        ArrayList<ArrayList> adjList = new ArrayList<>();
        char [] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int num = 7;
        int v = 0;
        for(int i = 0; i<num; i++){
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add('B');
        adjList.get(1).add('A');
        adjList.get(1).add('C');
        adjList.get(2).add('B');
        adjList.get(2).add('E');
        adjList.get(2).add('D');
        adjList.get(3).add('C');
        adjList.get(3).add('E');
        adjList.get(3).add('F');
        adjList.get(3).add('G');
        adjList.get(4).add('C');
        adjList.get(4).add('D');
        adjList.get(4).add('F');
        adjList.get(5).add('D');
        adjList.get(5).add('E');
        adjList.get(6).add('D');
        for(int i=0;i<num;i++,v++){
        System.out.println(vertices[v]+": "+adjList.get(i));
        }
    }
}
