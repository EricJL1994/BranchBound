package bb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    
    Map<Node, Integer> edge;
    List<Node> route;
    
    public Node() {
        this.edge = new HashMap<>();
        this.route = new ArrayList<>();
    }
    
    public void insert(Node node, int cost){
        edge.put(node, cost);
    }

    public void routeInsert(Node node){
        route.add(node);
    }
    
    public Map expand(){
        return edge;
    }
    
}
