package Graphs;

import java.util.Arrays;

public class AdjecentMatrixRepresentation {
	private int vertices;
	private int edges;
	private int[][] adjMatrix;
	
	public AdjecentMatrixRepresentation(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int v, int e) {
		adjMatrix[v][e] = 1;
		adjMatrix[e][v] = 1;
		edges++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vertices + " vertices, " + edges + " edges " + "\n");
		for (int v = 0; v < vertices; v++) {
			sb.append(v + ": ");
			for (int w : adjMatrix[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
	 
		AdjecentMatrixRepresentation g = new AdjecentMatrixRepresentation(4);
		
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
		
		System.out.println(Arrays.toString(g.adjMatrix));

		System.out.println("***************");

		for (int[] v1 : g.adjMatrix) {
			for(int v: v1) {
				System.out.print(v + " ");	
			}
			System.out.println();
		}
		
		System.out.println("***************");
		
		System.out.println(g);
	}

}
