import java.util.*;

public class DeliveryRoute {
    public static void main(String[] args) {

        int[][] graph = {
            {0, 4, 2, 0},
            {4, 0, 5, 10},
            {2, 5, 0, 3},
            {0, 10, 3, 0}
        };

        int n = graph.length;
        int start = 0;

        boolean[] visited = new boolean[n];
        int[] distance = new int[n];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE, u = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && distance[j] < min) {
                    min = distance[j];
                    u = j;
                }
            }

            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                        distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        System.out.println("Minimum delivery distances from warehouse:");
        for (int i = 0; i < n; i++) {
            System.out.println("Location " + i + " : " + distance[i]);
        }
    }
}