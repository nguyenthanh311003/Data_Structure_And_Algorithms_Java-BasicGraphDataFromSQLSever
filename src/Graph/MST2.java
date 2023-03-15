package Graph;
import Element.Edge;
import Element.Vertex;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MST2<T> {

    public void KuskalMST(List<Edge<T>> listOfEdges, List<Vertex<T>> listOfVertex) {
        for (Vertex<T> vertex : listOfVertex) {
            
        }
        int countVisited = listOfVertex.size() + (listOfVertex.size() - 1);

        List<Edge<T>> listOfPrim = new ArrayList<>();
        for (Vertex<T> vertex : listOfVertex) {
            vertex.setVisited(false);
        }

        //      15          >           8
        while (countVisited > listOfVertex.size()) {
            Edge<T> edgeMin = new Edge(listOfVertex.get(0), listOfVertex.get(6), Integer.MAX_VALUE);
            for (Edge<T> ledge : listOfEdges) {

                if (!ledge.getDestination().isVisited() && !ledge.isIncluded() && ledge.getWeight() < edgeMin.getWeight()) {
                    edgeMin = ledge;

                }
            }
            edgeMin.setIncluded(true);
  edgeMin.getDestination().setVisited(true);
            for (Edge<T> edgeD : listOfEdges) {
                if (edgeD.getSource().getData().equals(edgeMin.getDestination().getData())
                        && edgeD.getDestination().getData().equals(edgeMin.getSource().getData())) {
                    edgeD.setIncluded(true);
                }

            }
            listOfPrim.add(edgeMin);
            countVisited--;

        }
        int minimumWeight = 0;
        for (Edge<T> edge : listOfPrim) {
            System.out.println(" " + edge.getSource().getData() + "-->" + edge.getDestination().getData() + ": " + edge.getWeight());
            minimumWeight += edge.getWeight();

        }
        System.out.println("MinimumWeight: " + minimumWeight);

    }

}