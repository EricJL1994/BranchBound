/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bb;

/**
 *
 * @author usuario
 */
public class BB {
    
    public static void main(String[] args) {
        Node v0 = new Node();
        Graph graph = new Graph(v0);
        
        Node v11 = new Node();
        Node v12 = new Node();
        Node v13 = new Node();
        
        Node v21 = new Node();
        Node v22 = new Node();
        Node v23 = new Node();
        
        Node v3 = new Node();
        
        v0.insert(v11, 1);
        v0.insert(v12, 3);
        v0.insert(v13, 2);
        
        v11.insert(v21, 5);
        v11.insert(v23, 3);
        
        v12.insert(v21, 4);
        v12.insert(v22, 3);
        
        v13.insert(v22, 2);
        v13.insert(v23, 7);
        
        v21.insert(v3, 4);
        v22.insert(v3, 1);
        v23.insert(v3, 1);
        System.out.println(v0);
    }
    
}
