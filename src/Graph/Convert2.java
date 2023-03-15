/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import Element.Edge;
import Element.Vertex;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Convert2 {
     static void adjMatrixToList(List<Vertex<String>> listVertex, List<Edge<String>> listEdge) {

        for (Vertex<String> vertex : listVertex) {
            System.out.print(vertex.getData());

            for (Vertex<String> neighbor : vertex.getNeighbors()) {
                for (Edge<String> edge : listEdge) {
                    if (((vertex.getData().equals((edge.getSource().getData())) && (neighbor.getData().equals(edge.getDestination().getData()))))
                            || ((neighbor.getData().equals((edge.getSource().getData())) && (vertex.getData().equals(edge.getDestination().getData()))))) {
                        System.out.print(" --> " + neighbor.getData() + "| " + edge.getWeight());
                    }

                }

            }
            System.out.println("");
        }

    }
}
