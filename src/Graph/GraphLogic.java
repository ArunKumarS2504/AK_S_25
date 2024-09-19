package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphLogic {
	
	HashMap<Integer,ArrayList<Edges>> vertices = new HashMap<Integer, ArrayList<Edges>>();
	//int vertices;
	
	public GraphLogic(){
		
		//this.vertices=vertices;
	}
	
	public void addEdge(int source, int destination) {
		
		Edges edge = new Edges(source,destination);
		ArrayList<Edges> edges;
		if(vertices.get(source)!= null)
			edges=(vertices.get(source));
	    else
	    	edges=new ArrayList<Edges>();
				
	    edges.add(edge);
	    vertices.put(source, edges);
	}
	
	
	public void BFS(int startvalue) { 
		
		HashMap<Integer,Boolean> Verified = new HashMap<Integer,Boolean>();
		vertices.keySet().forEach(key->{
			Verified.put(startvalue, true);
		});
		
	    Queue<Integer> queueArr= new  LinkedList<>();
	    queueArr.add(startvalue);
	    Verified.put(startvalue, true);
	    
	    while(queueArr.size()!=0) {
	    	
	    	startvalue = queueArr.poll();
	    	System.out.println(startvalue);
	    	
	    	ArrayList<Edges> startnodeEdges = vertices.get(startvalue);
	    	
	    	for(int i=0;i<startnodeEdges.size();i++) {
	    		
	    		
	    		
	    	}
	    
	    	
	    	
	    	
	    }
	    
	    
	}
		public void print() {
//			edges.forEach(edge->{
//				System.out.println(edge.getdestination()+" "+edge.getsource());
//			});
			
			
		}
				
	}


