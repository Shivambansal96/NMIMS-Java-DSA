
// import java.util.ArrayList;
// public class Day10Graphs {
//     public class Edge {
//         int src;
//         int dest;
//         public Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
//     }
//     public void createGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 3));
//         graph[2].add(new Edge(2, 4));
//         graph[3].add(new Edge(3, 2));
//         graph[3].add(new Edge(3, 4));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 2));
//     }
//     // // Undirected / Bi-directed Graph
//     // public void createEdge(ArrayList<Edge>[] graph, int src, int dest) {
//     //     graph[src].add(new Edge(src, dest));
//     //     graph[dest].add(new Edge(dest, src));
//     // }
//     // Directed / Single direction Graph
//     public void createEdge(ArrayList<Edge>[] graph, int src, int dest) {
//         graph[src].add(new Edge(src, dest));
//     }
//     public static void main(String[] args) {
//         Day10Graphs graphs = new Day10Graphs();
//         int vertices = 2;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge>[] graph = new ArrayList[vertices];
//         // graphs.createGraph(graph);
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         // Creating edges in a graph Dynamically
//         graphs.createEdge(graph , 0, 1);
//         for (int idx = 0; idx < graph.length; idx++) {
//             System.out.print("Vertex = " + idx + " neighbors: ");
//             for (int i = 0; i < graph[idx].size(); i++) {
//                 Edge e = graph[idx].get(i);
//                 System.out.print("(" + e.src + ", " + e.dest + ")");
//             }
//             System.out.println();
//         }
//     }
// }
// // Fibonacci Basic Recursion
// public class Day10Graphs {
//     public static int fibonacci(int n) {
//         if (n <= 1)
//             return n;
//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }
//     public static void main(String[] args) {
//         int n = 6;
//         System.out.println(fibonacci(n));
//     }
// }



// Fibonacci Basic Recursion DP
public class Day10Graphs {

    public static int fibonacci(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if(dp[n] != 0) {
            return dp[n];
        }

        dp[n] =  fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 2;
        int[] dp = new int[n + 1];
        System.out.println(fibonacci(n, dp));
        // for (int val : dp) {
        //     System.out.println(val);
        // }
    }
}
