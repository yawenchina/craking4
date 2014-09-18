import java.util.LinkedList;
import java.util.Queue;


public class createBinaryTree {
	public static void main(String args[]){
		int[] array ={1,2,3,4,5,6,7,8,9};
		TreeNode root  = new TreeNode(0);
		 root = createTree(array,root,0,array.length-1);
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
		public static TreeNode createTree(int[] array,TreeNode root,int start,int end){
			if(start > end){
				return null;
			}
			int mid = (start + end)/2;
			root = new TreeNode(array[mid]);
			root.left = createTree(array,root,start,mid-1);
			root.right = createTree(array,root,mid+1,end);
			return root;
			
		}
		
}
