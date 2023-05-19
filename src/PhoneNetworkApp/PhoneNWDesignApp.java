/*
Group members : Safaa Khan , 2110828 ,B0B
                Noof Patwa , 2111058 , B8
                Rania Daghestani , 2105893 , B8
                Dina Ghulam Saeed , 2110468 ,B8
For Prim Algorithm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm
For Kruskal Algoritm :https://www.learnerslesson.com/Data-Structures-and-Algorithms/Prim's-Algorithm-Minimum-Spanning-Tree-Code.htm

 */
package PhoneNetworkApp;
import GraphFramework.Graph ;
import GraphFramework.KruskalMST;
import GraphFramework.PrimMST;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import javafx.util.Pair;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;



public class PhoneNWDesignApp    {
    // object of  BluePrintsGraph type 
    static  BluePrintsGraph  graph =new  BluePrintsGraph();


    public static void main(String[] args) throws FileNotFoundException {
        
          KruskalMST k;
          PrimMST s ;
        // intiliaze n=vertex m=edges of the graph and user choice of the menu variables 
        int n = 0, m = 0, MenuChoice = -1;
        Scanner in = new Scanner(System.in);
        // menu do while 
        do {
            System.out.println("\t\t\n------- Runtime of Different Minimum Spanning Tree Algorithms ------------\n");
            System.out.println("1- First Requarement : Read From The Graph ---------");
            System.out.println("2- Second Requarement : Creat Random Graph ---------");
            System.out.println("3- Exit from program ---------");
            System.out.print("> \nEnter your choice : ");
            MenuChoice = in.nextInt();
            if (MenuChoice != 1 && MenuChoice != 2&&MenuChoice != 3) {
                System.out.println("****Invalid input!****");
                 System.out.print("> Try Aqain  ");
               MenuChoice = in.nextInt();
               continue;
            }
            // menu break condition
            
            // to perform the Kruskal and prim of requarement 2 
             if ( MenuChoice == 2) {
            System.out.println("> Available cases (where n represents # of vertices and m represents # of edges: )");
            System.out.println(" 1-  n=1,000  - m=10,000");
            System.out.println(" 2-  n=1,000  - m=15,000");
            System.out.println(" 3-  n=1,000  - m=25,000");
            System.out.println(" 4-  n=5,000  - m=15,000");
            System.out.println(" 5-  n=5,000  - m=25,000");
            System.out.println(" 6-  n=10,000 - m=15,000");
            System.out.println(" 7-  n=10,000 - m=25,000");
            System.out.print("> Enter a case to test: ");
            int choice = in.nextInt();
            // switch for all avaliable cases of the test 
            while (choice < 1 || choice > 7) {
                System.out.println("Invalid input!");
                System.out.print("> Try Aqain  ");
                choice = in.nextInt();
            }
            switch (choice) {
                case 1: {
                    n = 1000;
                    m = 10000;
                }
                break;
                case 2: {
                    n = 1000;
                    m = 15000;
                }
                break;
                case 3: {
                    n = 1000;
                    m = 25000;
                }
                break;
                case 4: {
                    n = 5000;
                    m = 15000;
                }
                break;
                case 5: {
                    n = 5000;
                    m = 25000;
                }
                break;
                case 6: {
                    n = 10000;
                    m = 15000;
                }
                break;
                case 7: {
                    n = 10000;
                    m = 25000;
                }
                break;
            }
          // create random graph 
            graph.makeGraph(n,m);
            //start time 
             double StartTime = System.currentTimeMillis();
               
                // prime Algorithm ------------------------------------------
             s =new PrimMST(graph);
               s.primMST();
               
             //end time 
             double EndtTime = System.currentTimeMillis();
             // the total time of excution 
             System.out.println("\nThe time of designed phone network(Prime Algorithm): "+(EndtTime-StartTime));
             System.out.println("\n**The cost of designed phone network(Prime  Algorithm----) "+s.getTotal());
             // KRUSCAL ALGORITHM ---------------------------------------
             StartTime = System.currentTimeMillis();
            k =new KruskalMST(graph);
                k.KruskalMST();
           EndtTime = System.currentTimeMillis();
             System.out.println("\nThe time of designed phone network(Kruskal): "+(EndtTime-StartTime));
             System.out.println("\n**The cost of designed phone network(Kruskal  Algorithm----) "+k.getTotal());

        } 
          // to perform kruskal and prim  of first requariment 
          if (MenuChoice == 1) {
           
           graph.readFromFile("Graph.txt");
           
            k =new KruskalMST(graph);
             k.KruskalMST();
        
           s =new PrimMST(graph);
           s.primMST();
           
           s.displayResultingMST();
           
           k.displayResultingMST();
           
          
        }
          // to exit from program 
            if (MenuChoice == 3) {
           
                System.out.println("Good Bye :)");
                System.exit(0);
          
        }
        } while (MenuChoice != 3 );
       
        
        }
        
    }
