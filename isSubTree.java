
public class checkSubTree {
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
        //////////
		TreeNode  root1 = new TreeNode(15);
		TreeNode t11 = new TreeNode(12);
		TreeNode t21 = new TreeNode(20);
		root1.left = t11;
		root1.right = t21;
		 //////////
		TreeNode  root11 = new TreeNode(15);
		TreeNode t111 = new TreeNode(12);
		TreeNode t211 = new TreeNode(20);
		root11.left = t111;
		root11.right = t211;
		//																																																														System.out.print(subTree(root, root1));
		System.out.print(subTree(root, root11));
		System.out.print(subTree(root1,root11));
	}
	public static boolean subTree(TreeNode parent,TreeNode subTree){
		if(parent == null)
		return false;
		if(subTree == null){
			return true;
		}
		if(parent.val == subTree.val){
			return check(parent,subTree);
		}
		return subTree(parent.left,subTree)||subTree(parent.right,subTree);
	}
	public static boolean check(TreeNode parent,TreeNode subTree){
		if(parent == null && subTree == null){
			return true;
		}
		if(parent == null ){
			return false;
		}
		if( subTree == null){
			return false;
		}
		if(parent.val != subTree.val){
			return false;
		}
		return check(parent.left,subTree.left)&&check(parent.right,subTree.right);
	
	}
}
