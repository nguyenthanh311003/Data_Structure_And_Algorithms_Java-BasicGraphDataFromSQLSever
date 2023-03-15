/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import Element.Edge;
import Element.Vertex;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MST1<T> {

    public void PrimMST(String startVerName,List<Edge<T>> listOfEdges, List<Vertex<T>> listOfVertex) {

        int countVisited = listOfVertex.size() + (listOfVertex.size() - 1);
        
        //Reset status Visited
        List<Edge<T>> listOfPrim = new ArrayList<>();
        for (Vertex<T> vertex : listOfVertex) {
            vertex.setVisited(false);
        }
          Vertex<T> startVertex = new Vertex<>();
        for (Vertex<T> vertex : listOfVertex) {
            if(vertex.getData().equals(startVerName)){
                startVertex = vertex;
            }
        }
        
        //Prim start
      startVertex.setVisited(true);
       
        while (countVisited > listOfVertex.size()) {
            Edge<T> edgeMin = new Edge(listOfVertex.get(0), listOfVertex.get(listOfVertex.size() - 1), Integer.MAX_VALUE);
            for (Edge<T> ledge : listOfEdges) {

                if ((ledge.getSource().isVisited() && !ledge.getDestination().isVisited()) && ledge.getWeight() < edgeMin.getWeight()) {
                    edgeMin = ledge;

                }
            }
            edgeMin.getDestination().setVisited(true);
            listOfPrim.add(edgeMin);
            countVisited--;

        }
        
        int minWeight = 0;
        for (Edge<T> edge : listOfPrim) {
            System.out.println(" " + edge.getSource().getData() + " --> " + edge.getDestination().getData() + ": " + edge.getWeight());
            minWeight += edge.getWeight();

        }
        System.out.println("Minium Weight: " + minWeight);
        
        //Reset status Visited
         for (Vertex<T> vertex : listOfVertex) {
            vertex.setVisited(false);
        }

    } 

}
