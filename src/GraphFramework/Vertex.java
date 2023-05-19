package GraphFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {
 //declear the attribute    
  private String   label;
 // this link list is edge type to hode all aedges of vertex  
 private linklist  adjlist;
  private boolean isVisited;



//-------------------------------------------------------------
  
public Vertex(){
  this(null);
}
  public Vertex(String   inputData) {
    this.label = inputData;
    adjlist =new linklist();
    
  }

//-------------------------------------------------------------
  // this method is used add edge of vertex 
  public void addEdge(Vertex source ,Vertex endVertex, Integer weight) {
   adjlist.addEdge(new Edge( source,endVertex, weight));
   
  }

//------------------------------------------------------------
  //this method is used to return the adjlist list of edges of vertex
  public linklist  getEdges(){
    return this.adjlist;
  }
  
  //-------------------------------------------------------------
  public boolean isIsVisited() {
    return isVisited;
}
//-------------------------------------------------------------  
public void setIsVisited(boolean isVisited) {
    this.isVisited = isVisited;
}
//-------------------------------------------------------------
 //this methodd is used to get label of node
  public String   getLabel() {
    return label;
}
//-------------------------------------------------------------
  //this methodd is used to set the label of node
public void setLabel(String  label) {
    this.label = label;
}
//-------------------------------------------------------------
  //this methodd is used to set the list of edges
    public void setEdges(linklist edges) {
        this.adjlist = edges;
    }
//-------------------------------------------------------------
  // this method is used to print all attribue of the vertex
    public  void displayInfo() {
        System.out.print( "Office No. "+(char)(Integer.parseInt(label)+65) +" ") ;
//        adjlist.printAllNodes();
//        System.out.println( " isVisited=" + isVisited + '}');
    }

    }

    
     

