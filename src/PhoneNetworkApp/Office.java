
package PhoneNetworkApp;
import GraphFramework.Vertex;
//sub class of vertex
public class Office  extends Vertex{
 //------------------------------------------------------------- 
    public Office() {
    }

    public Office(String inputData) {
        super(inputData);
    }
    
  //------------------------------------------------------------- 
   // this method is used to display the attribut of office class 
    @Override
     public  void displayInfo() {
         System.out.print("Office No. "+(char)(Integer.parseInt(getLabel())+65)+" ");
              //getEdges().printAllNodes();
     }
 //-------------------------------------------------------------  
     // this method is used to store O1, O2,â€¦ or O15 â€“ starts with O followed by a unique number 
    @Override
     public  void setLabel (String label){
          label ="O "+ label;
         super.setLabel( label);
    
}         
        
    
    
}
