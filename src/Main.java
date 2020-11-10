// Ali Mourad
//328 assignment 4 MAZE

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));

        String mazeLine = "";

        int mazeCount = reader.nextInt();
        reader.nextLine();

        int mazeDimension = reader.nextInt();
        reader.nextLine();

        for(int j = 0; j < mazeCount; j++) {
            for (int i = 0; i < mazeDimension; i++) {
                mazeLine += reader.next();
            }
            mazeLine += ",";
        }

//        System.out.println(mazeLine);
        
        String tempStr[] = mazeLine.split(",");
        List<String> mazeList = new ArrayList<String>();
        mazeList = Arrays.asList(tempStr);

        for(String s: mazeList){
            System.out.println(s);
        }

//        Node n1 = new Node("1");
//        Node n2 = new Node("2");
//        Node n3 = new Node("3");
//        Node n4 = new Node("4");
//        Node n5 = new Node("5");
//
//        List<Node> list = new ArrayList<>();
//
//        n1.addNeighbour(n2);
//        n1.addNeighbour(n3);
//        n3.addNeighbour(n4);
//        n4.addNeighbour(n5);
//
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
//        list.add(n4);
//        list.add(n5);
//
//        DFS dfs = new DFS();
//        dfs.dfs(list);
    }
}
class Node{

    private String name;
    private boolean visited;
    private List<Node> neighbours;

    public Node(String name){
        this.name = name;
        this.neighbours = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void addNeighbour (Node node){
        this.neighbours.add(node);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }
}

class DFS{

    private final Stack<Node> nodeStack;

    public DFS(){
        this.nodeStack = new Stack<>();
    }
    public void dfs(List<Node> nodeList){
        
        for(Node n : nodeList){
            if(!n.isVisited()){
                n.setVisited(true);
                dfsWithStack(n);
            }
        }
    }

    private void dfsWithStack(Node rootNode) {
        this.nodeStack.add(rootNode);
        rootNode.setVisited(true);

        while(!nodeStack.isEmpty()){

            Node actualNode = this.nodeStack.pop();
            System.out.println(actualNode+" ");

            for(Node n : actualNode.getNeighbours()){
                if(!n.isVisited()){
                    n.setVisited(true);
                    this.nodeStack.push(n);
                }
            }
        }
    }
}