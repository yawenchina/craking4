
public class polutateToNext {
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
		root =populate(root);
	    //print(root);
	    //print(root.left);
	    print(root.left.left);
	}
	public static TreeNode populate(TreeNode root){
		if(root == null){
			return null;
		}
	      if(root .left != null){
	    	  root.left.next = root.right;
	      }
	      if(root.right != null){
	    	  if(root.next != null){
	    	  root.right.next = root.next.left;
	      }else{
	    	  root.right.next = null;
	      }
	      }
	      populate(root.left);
	      populate(root.right);
		return root;
	}
	public static void print(TreeNode root){
		while(root != null){
			System.out.print(root.val);
			root = root.next;
		}
	}
}
