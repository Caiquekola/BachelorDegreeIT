package aeds.faseZero;
import java.util.*;

public class Boto {

        static class Edge {
            int v, c;
            public Edge(int v, int c) {
                this.v = v;
                this.c = c;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int K = scanner.nextInt();

            List<Edge>[] graph = new ArrayList[N + 1];
            for (int i = 0; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            int[] times = new int[M];
            for (int i = 0; i < M; i++) {
                int U = scanner.nextInt();
                int V = scanner.nextInt();
                int C = scanner.nextInt();
                graph[U].add(new Edge(V, C));
                graph[V].add(new Edge(U, C));
                times[i] = C;
            }

            Arrays.sort(times);

            int left = 0, right = times.length - 1;
            int answer = -1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (canVisitKCities(graph, N, K, times[mid])) {
                    answer = times[mid];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(answer);
        }

        public static boolean canVisitKCities(List<Edge>[] graph, int N, int K, int maxTime) {
            boolean[] visited = new boolean[N + 1];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            visited[1] = true;
            int visitedCount = 0;

            while (!queue.isEmpty()) {
                int current = queue.poll();
                visitedCount++;
                if (visitedCount >= K) {
                    return true;
                }

                for (Edge edge : graph[current]) {
                    if (!visited[edge.v] && edge.c <= maxTime) {
                        visited[edge.v] = true;
                        queue.add(edge.v);
                    }
                }
            }

            return visitedCount >= K;
        }
    }

