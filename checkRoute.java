import java.util.*;

public class checkRounte {
	public static void main(String args[]){
		Node  root = new Node(10);
		Node t1 = new Node(9);
		Node t2 = new Node(15);
		Node t3  = new Node(2);
		Node t4 = new Node(7);
		Node t5 = new Node(12);
		Node t6 = new Node(20);
		root.one = t1;
		root.two = t2;
		root.three = t3;
		t1.one = t4;
		t1.two = t5;
		t1.three = t6;
		System.out.print(getRoute(t1,t6));
		
	}
	public static boolean getRoute(Node root, Node one){
		root.s= state.visiting;
		Queue<Node> q = new LinkedList<Node>();
		q.add(one);
		while(!q.isEmpty()){
			Node temp = q.poll();
			if(temp != null){
				for(Node m : temp.getA()){
					if(m.s == state.unvisited){
						if(m == one){
							return true;
						}else{
							m.s= state.visiting;
							q.offer(m);
						}
					}
				}
				temp.s = state.visited;
				
			}
			
		}
		return false;
	}
}
