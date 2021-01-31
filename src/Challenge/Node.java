
package Challenge;

/**
 *
 * @author Producer
 */
public class Node {
    String value; 
    Node next; 

    public Node () { 
        value = " "; 
        next = null; 
    } 

    public Node (String value, Node next) { 
        this.value = value; 
        this.next = next; 
    } 

    public String toString () { 
        return value + ""; 
    } 
} 
