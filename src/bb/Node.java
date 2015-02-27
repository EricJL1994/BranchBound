package bb;

import java.util.HashMap;
import java.util.Map;

public class Node {
    
    Map<Node, Integer> edge;
    
    public Node() {
        this.edge = new HashMap<>();
    }
    
    public void insert(Node node, int cost){
        edge.put(node, cost);
    }
    
    public Map expand(){
        return edge;
    }
    
}
