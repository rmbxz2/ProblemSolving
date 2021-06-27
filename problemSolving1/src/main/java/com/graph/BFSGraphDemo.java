package com.graph;

public class BFSGraphDemo {
    // lsp-java-java-path
	public static void main(String[] args) {
		/**
		* 
		*
		*/
		BFSGraph g = new BFSGraph(6);
		// more easy directed graph
		g.add(0, 2);
		g.add(0, 1);
		g.add(1, 4);
		g.add(1, 3);
		g.add(2, 5);



		// more complex undirected graph

		// g.add(0, 2);
		// g.add(0, 1);
		// g.add(1, 4);
		// g.add(1, 3);
		// g.add(1, 0);
		// g.add(3, 1);
		// g.add(4, 1);
		// g.add(2, 5);
		// g.add(2, 0);
		// g.add(5, 2);
		g.BFSExplore(0);
	}
}
