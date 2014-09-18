
public class createBinarySearchTree2 {
////in fact it is the populat to the next in general condition;
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
	//t1.right = t4;
	t2.left = t5;
	//t2.right = t6;
	root =populate(root);
	print(root);
	print(root.left);
	print(root.left.left);

	}
	public static TreeNode populate(TreeNode root){
		if(root == null){
			return null;
		}
		TreeNode parent = root;
		TreeNode pre = null;
		TreeNode next = null;
		while(parent != null){
			pre = null;
			next = null;
			while(parent != null){
				if(next == null) {
					next = (parent.left != null)? parent.left: parent.right;
				}
				if(parent.left != null){
					if(pre == null){
						pre = parent.left;
					}else{
						pre.next = parent.left;
						pre = pre.next;
					}
				}
				if(parent.right != null){
					if(pre == null){
						pre = parent.right;
					}else{
						pre.next = parent.right;
						pre = pre.next;
					}
				}
				parent = parent.next;
			}
			parent = next;
			
		}
		return root;
	}
	public static void print(TreeNode root){
		while(root != null){
			System.out.print(root.val);
			root = root.next;
		}
	}
}
