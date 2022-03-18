import java.util.*;
import java.util.LinkedList;

public class DFS {
	
	private LinkedList<Integer> adj[];
	
	public DFS(int v) {
		adj = new LinkedList[v];
		
		for(int i =0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdges(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	//Recursion Method
	private boolean depthFirstSearchUtil(int source, int destination, boolean [] visited) {
	
		if(source == destination)
			return true;
		
		for(int neighbor : adj[source]) {
			if(!visited[neighbor]) {
				
				visited[neighbor] = true;
				boolean  isConnected = depthFirstSearchUtil(neighbor, destination, visited);
				if(isConnected) 
					return true;
			}
		}
		return false;
	}
	
	//Stack Method
	public boolean dfsStack(int source, int destination) {
		boolean vis [] = new boolean[adj.length];
		vis[source] = true;
		
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(cur == destination)
				return true;
			
			for(int neighbor : adj[cur]){
				
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		return false;
	}
	
	public boolean depthFirstSearch(int source, int destination) {
		boolean visited [] = new boolean[adj.length];
		visited[source]= true;
		
		return depthFirstSearchUtil(source, destination, visited);
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		DFS dfs = new DFS(v);
		
		System.out.println("Enter "+e+" edges");
		
		for(int i =0;i<e;i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			dfs.addEdges(source, destination);
		}
		

		System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();
		System.out.println(dfs.depthFirstSearch(source, destination));
		
		System.out.println(dfs.dfsStack(source, destination));
		
		sc.close();

	}
}
