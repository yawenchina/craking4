
import java.util.*;

public class BFS {
	public static void main(String args[]){
		TreeNode  root = new TreeNode(10);
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(15);
		TreeNode t3  = new TreeNode(2);
		TreeNode t4 = new TreeNode(7);
		TreeNode t5 = new TreeNode(12);
		TreeNode t6 = new TreeNode(20);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		doBFS(root);
	}
	public static void doBFS(TreeNode root){
		Queue<TreeNode> s = new LinkedList<TreeNode>();
		s.offer (root);
		while (!s.isEmpty()){
			TreeNode temp = s.poll();
			System.out.print(temp.val);
			if (temp.left != null){
				s.offer(temp.left);
	}
			if (temp.right != null){
				s.offer(temp.right);
	}


	}
	 

	}
}
