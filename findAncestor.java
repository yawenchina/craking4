
public class commonA {
	public static void main(String args[]){
		TreeNode  root = new TreeNode(10);
		TreeNode t1 = new TreeNode(1);
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
	    System.out.print(find(t1, t3, root).val);
	}
	public static TreeNode find(TreeNode t3,TreeNode t4, TreeNode root){
		if(root == null){
			return null;
		}
		if(root  == t3){
			return root;
		}
		if(root == t4){
			return root;
		}
		TreeNode left = find(t3, t4, root.left);
		TreeNode right =find(t3, t4,root.right);
		if(left != null && right != null){
			return root;
		}
			return left != null ? left : right;
	

	}
	
}
