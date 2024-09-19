package Graph;

public class GraphMain {

	public static void main(String[] args) {
		
//		int source = 0;
		
		
		GraphLogic graph = new GraphLogic();
		
		graph.addEdge(3, 7);
		graph.addEdge(3, 6);
		graph.addEdge(3, 2);
		graph.addEdge(7, 4);
		graph.addEdge(7,2);
		graph.addEdge(6,2);
	    graph.addEdge(4, 9);
	    
	 
	}

}
