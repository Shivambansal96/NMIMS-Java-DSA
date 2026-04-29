// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

// public class Day10Graphs {

//     public class Edge {
//         int src;
//         int dest;

//         public Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }

//     }

//     public void createEdges(ArrayList<Edge>[] graph) {

//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // arr[i].add(EDGES(src, dest));
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 3));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 2));
//         graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));

//     }

//     // // Directed Graph
//     // public void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
//     //     graph[src].add(new Edge(src, dest));
//     // }

//     //Undirected Graph
//     public void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
//         graph[src].add(new Edge(src, dest));
//         graph[dest].add(new Edge(dest, src));
//     }

//     public void bfs(ArrayList<Edge>[] graph){
//         Queue<Integer> q = new LinkedList<>();

//         int V = graph.length;

//         boolean[] visited = new boolean[V];

//         q.add(0);

//         while(!q.isEmpty()) {
//             int temp = q.remove();

//             if(visited[temp] == false) {
//                 System.out.println(temp);
//                 visited[temp] = true;

//                 for (int i = 0; i < graph[temp].size(); i++) {
//                     Edge e = graph[temp].get(i);
//                     q.add(e.dest);
//                     // q.add(graph[temp].get(i).dest);
//                 }
//             }
//         }

//     }

//     public static void main(String[] args) {

//         Day10Graphs graphs = new Day10Graphs();

//         int vertices = 5;

//         // dataType[] var_name = new dataType[size];
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge>[] graph = new ArrayList[vertices];

//         graphs.createEdges(graph);
//         graphs.bfs(graph);

//         // for (int i = 0; i < graph.length; i++) {
//         //     graph[i] = new ArrayList<>();
//         // }

//         // graphs.addEdge(graph, 0, 1);
//         // graphs.addEdge(graph, 0, 2);

//         // for (int idx = 0; idx < graph.length; idx++) {
//         //     System.out.print("Node " + idx + " neighbours: ");

//         //     for (int i = 0; i < graph[idx].size(); i++) {
//         //         Edge e = graph[idx].get(i);
//         //         System.out.print("(" + e.src + "," + e.dest + ")");
//         //     }
//         //     System.out.println();
//         // }

//     }
// }

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

public class Day10Graphs {

    public static int fibonacci(int n, int[] dp) {

        if (n <= 1)
            return n;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;

        int[] dp = new int[n + 1];
        System.out.println(fibonacci(n, dp));
        System.out.println(fibonacci(3, dp));
    }
}