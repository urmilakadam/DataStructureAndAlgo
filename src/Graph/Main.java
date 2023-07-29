package Graph;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.printGraph();

        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.printGraph();

        graph.removeEdge("A", "B");
        graph.printGraph();

        graph.removeVertex("D");
        graph.printGraph();
    }
}
