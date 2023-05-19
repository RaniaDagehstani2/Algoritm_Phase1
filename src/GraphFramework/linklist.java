package GraphFramework;

import java.util.logging.Logger;
import PhoneNetworkApp.Line;
import PhoneNetworkApp.Office;
 

public class linklist  {
    private Line  head;
    private int size ;
    
    // Constructor
    public linklist() {
       head = null;
    }
 
    // Example Method to check if list is empty
    public boolean isEmpty() {
       return head == null;
    }
    
   public void printAllNodes() {
      Line hPointer =head;
 while (hPointer != null) {
      hPointer .displayInfo();
      hPointer =(Line) hPointer.getNext();
   }
   }

   public void addEdge(Edge e) {
   // Insertion as First node, Empty or non-empty list
 	 if (head ==null){
      head = new Line(e.getEnd(),e.getWeight(),head);
         size++;
         }
   // Insertion anywhere else even at last
         else{
     Line   helpPtr = head;
      while (helpPtr.getNext()!= null) {
           // we found our spot and stop traversal 
         helpPtr = (Line)(helpPtr.getNext());
      }
      // Now make new node and insert
      helpPtr.setNext(  new Line(e.getEnd(),e.getWeight(),helpPtr.getNext()));
      size++;
      
   }
   }
   
   public void deleteEdge(Vertex v) {
   if (!isEmpty()) {
      if (head.getEnd()== v)  // if â€œvalueâ€‌ is in the first node
         head = (Line)head.getNext();
      // ELSE, value is (possibly) elsewhere in the list
      else {
         Edge help_ptr = head;
         while (help_ptr.next != null) {
            if (help_ptr.next.getEnd()== v) {
               help_ptr.next = help_ptr.next.next;
               size--;
               break;
            }
            help_ptr = help_ptr.next;
         }
         
     }
   }
   }
         
    public Line  getEdge() {
       Line  help_ptr = head;
         if(head !=null){
         head =(Line)head.getNext();
         return  help_ptr;
         }
         else return null;
       
   
}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Line  getHead() {
        return head;
    }

    public void setHead(Line head) {
        this.head = head;
    }
   
 
   

 
}
 