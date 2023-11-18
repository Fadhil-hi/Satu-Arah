package Back_End;
import java.util.*;

class Vertex {

    public String label;

    public Vertex(String lab)
    {
        label = lab;
    }
}
class WeightedDirectedGraph {

    private final int MAX_VERTS = 20;
    private int nVerts;
    private Vertex vertexList[];
    private int adjMat[][];
    private int[] shortestPath;
    private boolean[] visited;

    public WeightedDirectedGraph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        shortestPath = new int[MAX_VERTS];
        visited = new boolean[MAX_VERTS];

        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0; // Inisialisasi matriks ketetanggaan dengan 0
            }
        }
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label + " ");
    }

    public void displayEdges() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                if (adjMat[i][j] > 0) {
                    System.out.println("Edge from " + vertexList[i].label + " to " + vertexList[j].label + " with weight " + adjMat[i][j]);
                }
            }
        }
    }
    public void dijkstra(int startVertex) {
        Arrays.fill(shortestPath, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        shortestPath[startVertex] = 0;

        for (int i = 0; i < nVerts - 1; i++) {
            int u = findMinDistanceVertex();
            visited[u] = true;

            for (int v = 0; v < nVerts; v++) {
                if (!visited[v] && adjMat[u][v] != 0 && shortestPath[u] != Integer.MAX_VALUE
                        && shortestPath[u] + adjMat[u][v] < shortestPath[v]) {
                    shortestPath[v] = shortestPath[u] + adjMat[u][v];
                }
            }
        }
    }

    public int findMinDistanceVertex() {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;

        for (int v = 0; v < nVerts; v++) {
            if (!visited[v] && shortestPath[v] < minDistance) {
                minDistance = shortestPath[v];
                minVertex = v;
            }
        }

        return minVertex;
    }

    public void displayShortestPaths() {
        System.out.println("Shortest paths from the start vertex:");
        for (int v = 0; v < nVerts; v++) {
            System.out.println("To vertex " + vertexList[v].label + ": " + shortestPath[v]);
        }
    }

    public static void main(String[] args) {
        WeightedDirectedGraph theGraph = new WeightedDirectedGraph();

        theGraph.addVertex("Jl. Semeru");
        theGraph.addVertex("Jl. Bromo");
        theGraph.addVertex("Jl. Brigadir Riyadi");
        theGraph.addVertex("Jl. Jaksa A. Suprapto");

        theGraph.addEdge(0, 1, 2); // Edge dari A ke B dengan bobot 2
        theGraph.addEdge(1, 2, 3); // Edge dari B ke C dengan bobot 3
        theGraph.addEdge(2, 3, 4); // Edge dari C ke D dengan bobot 4
        theGraph.addEdge(3,0,5);

        System.out.println("Edges in the weighted directed graph:");
        theGraph.displayEdges();
        theGraph.displayVertex(1);
        theGraph.dijkstra(1);
        theGraph.displayShortestPaths();
    }
}

