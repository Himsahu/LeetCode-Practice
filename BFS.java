import java.util.LinkedList;
import java.util.*;

public class BFS {
	
	private LinkedList<Integer> adj[];
	
	public BFS(int v) {
		adj = new LinkedList[v];
		
		for(int i =0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdges(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int breadthFirstSearch(int source, int destination) {
		boolean visited[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue <Integer> queue = new LinkedList<>();
		
		queue.add(source);
		parent[source] = -1;
		visited[source] = true;
		
		while(!queue.isEmpty()) {
			//first element nikalna 
			int cur = queue.poll();
			
			if(cur==destination)
				break;
			
			for(int neighbor: adj[cur]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
					parent[neighbor] = cur;	
				}
			}
		}
		
		int current = destination;
		int distance = 0;
		while(parent[current] != -1) {
			System.out.print(current+"->");
			current = parent[current];
			distance++;
		}
		System.out.println("0");
		
		return distance;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		BFS bfs = new BFS(v);
		
		System.out.println("Enter "+e+" edges");
		
		for(int i =0;i<e;i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			bfs.addEdges(source, destination);
		}
		

		System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();
		System.out.println("Distance count " + bfs.breadthFirstSearch(source, destination));
		
		sc.close();
	}
}
