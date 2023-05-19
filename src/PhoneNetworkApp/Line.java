/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneNetworkApp;

/**
 *
 * @author User
 */
import GraphFramework.Edge;
import GraphFramework.Vertex;
public class Line extends Edge {
    Integer Length ;

   public Line(){
       super();
   } 

    public Line( Vertex source, Vertex target, Integer inputWeight) {
        super(source, target, inputWeight);
        this.Length = 0;
    }

    public Line( Vertex target, Integer inputWeight, Edge next) {
        super(target, inputWeight, next);
        this.Length = Length;
    }

    public Line( Vertex target, Integer inputWeight) {
        super(target, inputWeight);
        this.Length = Length;
        
    }

    public void setLength(Integer Length) {
        this.Length =Length ;
    }

    public Integer getLength() {
        return Length;
    }
    
    
    
    @Override
    
     public void displayInfo(){
         
        
        System.out.print( "Office No. "+(char)(Integer.parseInt(getTarget().getLabel())+65)+"  line length "+getLength()+ "\n");
        
    
         
     }
  
    
}
