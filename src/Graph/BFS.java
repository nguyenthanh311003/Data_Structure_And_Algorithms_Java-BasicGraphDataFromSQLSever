/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import Element.Vertex;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BFS {

  
    
    public static void PrintBFS(String s ,List<Vertex<String>> getVertex) {
        System.out.println(
                "Following is Breadth First Traversal "
                + "(starting from vertex " + s + ")");
        LinkedList<Vertex<String>> queue = new LinkedList<>();
        LinkedList<Vertex<String>> visited = new LinkedList<>();

        Vertex<String> newVertex = new Vertex<>(s);

        for (Vertex<String> vertexInList : getVertex) {
            if (vertexInList.getData().equalsIgnoreCase(newVertex.getData())) {
                newVertex = vertexInList;
                break;
            }
        }

        visited.add(newVertex);
        queue.add(newVertex);

        while (!queue.isEmpty()) {
            newVertex = queue.poll();
            for (Vertex<String> v : getVertex) {
                for (Vertex<String> neighbor : v.getNeighbors()) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }

            }
        }
        for (Vertex<String> v : visited) {
            System.out.println(v.getData());
        }
    }
}
