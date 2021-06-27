package com.graph;

import java.util.Stack;

public class DFSGraph {
	int size;
	adjList[] array;

	/**
	 * 
	 * @param size
	 */
	public DFSGraph(int size) {
		this.size = size;
		array = new adjList[this.size];
		for (int i = 0; i < size; i++) {
			array[i] = new adjList();
		}
	}

	/**
	 * 
	 * @param src
	 * @param dest
	*/
	public void add(int src, int dest) {
		Node n = new Node(dest, null);
		n.next = array[src].head;
		array[src].head = n;
	}

	/** 
	 * 
	 * @param StartVertex
	*/
	public void DFSExplore(int StartVertex) {
		Boolean[] visited = new Boolean[size];
		for (int i = 0; i < size; i++)
			visited[i] = false;
		Stack<Integer> st = new Stack<Integer>();
		st.push(StartVertex);
		while (!st.isEmpty()) {
			int n = st.pop();
			st.push(n);
			visited[n] = true;
			Node head = array[n].head;
			Boolean isDone = true;
			while (head != null) {
				if (!visited[head.value]) {
					st.push(head.value);
					visited[head.value] = true;
					isDone = false;
					break;
				} else {
					head = head.next;
				}
			}
			if (isDone == true) {
				if (array[st.peek()].head == null) {
					System.out.println("Full Depth first is " + st.toString());
				}
				int out = st.pop();
				System.out.println("Visted node: " + out);
			}
		}
	}
}
