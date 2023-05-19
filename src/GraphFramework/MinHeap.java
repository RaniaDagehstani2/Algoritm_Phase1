


package GraphFramework;
import java.util.*;

import java.util.Map;



class MinHeap {

    Map<Integer, Integer> vertexVal;
    Integer[] verticesKeyArray;

    MinHeap(Map<Integer  , Integer> vertexVal){

        this.vertexVal = vertexVal;
    }

    public void heapify(Integer[] verticesArray,int root, int length) {

        int left = (2*root)+1;
        int right = (2*root)+2;
        int smallest = root;

        if (left < length && right <= length && vertexVal.get(verticesArray[right]) < vertexVal.get(verticesArray[left])) {

            smallest = right;
        }
        else if (left <= length){

            smallest = left;
        }

        if (vertexVal.get(verticesArray[root]) > vertexVal.get(verticesArray[smallest])) {

           Integer temp = verticesArray[root];
            verticesArray[root] = verticesArray[smallest];
            verticesArray[smallest] = temp;

            heapify(verticesArray, smallest, length);
        }
    }

    public void buildHeap() {

        Set<Integer > verticesSet = vertexVal.keySet();

        // Now convert the above keys to an Array.
        Integer[] verticesArray = new Integer[verticesSet.size()];
        verticesSet.toArray(verticesArray);

        int len = verticesArray.length-1;

        for (int parent = (len-1)/ 2; parent >= 0; parent--)
            heapify(verticesArray, parent, len);

        verticesKeyArray = verticesArray;

    }

    public void updateHeap(Integer  vertex, int length) {

        vertexVal.put(vertex, length);

        // Get all the keys (i.e. Vertices ) for the Map.
        Set<Integer > verticesSet = vertexVal.keySet();

        // Now convert the above keys to an Array.
        Integer [] verticesArray = new Integer [verticesSet.size()];
        verticesSet.toArray(verticesArray);

        int len = verticesArray.length-1;

        for (int parent = (len-1)/ 2; parent >= 0; parent--)
            heapify(verticesArray, parent, len);

        verticesKeyArray = verticesArray;
    }

    boolean containsVertex(Integer  vertex){

        if (vertexVal.containsKey(vertex))
            return true;
        else
            return false;
    }

    public Integer deleteMin() {

        Integer  temp = verticesKeyArray[0];

        int len = verticesKeyArray.length-1;

        verticesKeyArray[0] = verticesKeyArray[len];

        vertexVal.remove(temp);

        verticesKeyArray = Arrays.copyOf(verticesKeyArray, len);

        if (len>0)
            heapify(verticesKeyArray, 0, len-1);

        return temp;
    }

    int getWeight(Integer  vertex){

        return vertexVal.get(vertex);
    }

    public boolean empty() {

        if (verticesKeyArray.length>0)
            
            return false;
        else
            return true;

    }

   
}



