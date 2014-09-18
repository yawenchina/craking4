import java.util.*;
public class balancedTree {
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
		System.out.print(chechbalanced(root));
	}
	public static boolean chechbalanced(TreeNode root){

		if(getHeight(root) == -1){
			return false;
		}
		return true;
	}
	public static int getHeight(TreeNode root){
		
		if(root == null){
			return 0;
		}
		int a = getHeight(root.left);
		int b = getHeight(root.right);
		if(a == -1 ||b == -1 || Math.abs(a-b) > 1){
			return -1;
		}
		return Math.max(getHeight(root.right),getHeight(root.left)) + 1;
		
	}
}
