
package PhoneNetworkApp;

import GraphFramework.Graph;
import java.util.ArrayList;
 
public class BluePrintsGraph extends Graph {

    public BluePrintsGraph() {
         super();
  
       
        
    }
     
    
   //Override creation methods  
    @Override
    public Office createVertex(String  label){
        return new Office(label);
          
   }
    @Override
   public Line CreateEdge(Office v1, Office  v2 ,Integer  w){
      Line e =new Line ( v1 , v2 , w);
      e.setSource(v1);
      e.setLength(w*5);
      return e;
   }
    
}
