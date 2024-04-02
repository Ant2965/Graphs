// package gr;
import java.util.*;

public class Dfs {
	static class edge{
		int source;
		int destination;
		int weight;
		
		edge(int s,int d,int w){
			this.source=s;
			this.destination=d;
			this.weight=w;
		}
	}
	
	public static void grcr() {

		int vertice =5;
		
		ArrayList<edge> gr[]=new ArrayList[vertice];
		
		for(int i=0;i<gr.length;i++) {
			gr[i]=new ArrayList<>();
		}
		
		
		
		
		
		gr[0].add(new edge(0,1,5));
		
		gr[1].add(new edge(1,0,5));
		gr[1].add(new edge(1,2,1));
		gr[1].add(new edge(1,3,3));

		gr[2].add(new edge(2,1,1));
		gr[2].add(new edge(2,3,1));
		gr[2].add(new edge(2,4,2));
		
		
		
		gr[3].add(new edge(3,1,3));
		gr[3].add(new edge(3,2,1));
		
		gr[4].add(new edge(4,2,2));
		
		for(int i=0;i<gr[2].size();i++) {
			
			edge e= gr[2].get(i);
			
//			System.out.print(e.destination);
			
		}
		
//		bfs(gr);
		dfs(gr,0,new boolean[vertice]);

		
	}
	public static void bfs(ArrayList<edge>gr[]) {
		Queue<Integer>q=new LinkedList<>();
		
		boolean vis[]=new boolean[gr.length];	

		q.add(0);
		
		while(!q.isEmpty()) {
			
			int curr=q.poll();
			if(!vis[curr]) {
			System.out.println(curr);
			vis[curr]=true;

			}
			
			
			for(int i=0;i<gr[curr].size();i++) {
				 int a = gr[curr].get(i).destination;
				 
				 q.add(a);
			}
		
		}
	
	}
	
	public static void dfs(ArrayList<edge>[]gr,int curr,boolean vis[]) {
		System.out.println(curr);
		vis[curr]=true;
		
		for(int i=0;i<gr[curr].size();i++) {
			edge e =gr[curr].get(i);
			
			if(!vis[e.destination]) {
				dfs(gr,e.destination,vis);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grcr();
		
		


	}

}
