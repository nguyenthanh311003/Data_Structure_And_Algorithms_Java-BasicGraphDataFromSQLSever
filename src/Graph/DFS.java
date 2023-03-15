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
public class DFS {
     public static void PrintDFS(String s, List<Vertex<String>> getVertex) {
        System.out.println(
                "Following is Depth First Traversal "
                + "(starting from vertex " + s + ")");
        LinkedList<Vertex<String>> stack = new LinkedList<>();
        LinkedList<Vertex<String>> visited = new LinkedList<>();

        Vertex<String> newVertex = new Vertex<>(s);

        for (Vertex<String> vertexInList : getVertex) {
            if (vertexInList.getData().equals(newVertex.getData())) {
                newVertex = vertexInList;
                break;
            }
        }

        stack.add(newVertex);

        while (!stack.isEmpty()) {
            newVertex = stack.pop();

            for (Vertex<String> vertexInList : getVertex) {
                if (vertexInList.getData().equals(newVertex.getData())) {
                    newVertex = vertexInList;
                    break;
                }
            }

            if (!visited.contains(newVertex)) {
                visited.add(newVertex);
                for (Vertex<String> neighbor : newVertex.getNeighbors()) {
                    stack.addFirst(neighbor);
                }

            }

        }
        for (Vertex<String> v : visited) {
            System.out.println(v);
        }
    }

    
}
