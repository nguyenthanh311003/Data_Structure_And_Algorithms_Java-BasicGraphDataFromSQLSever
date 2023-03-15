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
public class Convert1 {
    static void adjMatrixToIncMatrix(List<Vertex<String>> listVertex, List<Edge<String>> listEdge) {
        System.out.print("  ");
        for (Edge<String> edge : listEdge) {

            System.out.print(" " + edge.getSource() + "" + edge.getDestination());

        }
        System.out.println("");
        for (Vertex<String> vertex : listVertex) {
            System.out.print(vertex.getData() + " ");
            for (Edge<String> edge : listEdge) {
                if (vertex.getData().equals(edge.getSource().getData())
                        || vertex.getData().equals(edge.getDestination().getData())) {

                    System.out.print("  " + edge.getWeight());

                } else {
                    System.out.print("  0");
                }
            }
            System.out.println("");
        }

        System.out.println("");

    }
    
}
