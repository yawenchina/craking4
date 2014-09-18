import java.util.*;;

public class checkValue {
	public static void main(String args[]){
		TreeNode  root = new TreeNode(10);
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(15);
		TreeNode t3  = new TreeNode(2);
		TreeNode t4 = new TreeNode(7);
		TreeNode t5 = new TreeNode(12);
		TreeNode t6 = new TreeNode(20);
		TreeNode t7 = new TreeNode(-27);
		TreeNode t8 = new TreeNode(27);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		t4.left = t7;
		t7.left = t8;
		int target = 27;
		Queue<TreeNode> s = new LinkedList<TreeNode>();
		s.offer (root);
		
		while (!s.isEmpty()){
			TreeNode temp = s.poll();
			ArrayList<Integer> result = new ArrayList<Integer>();
			checkValue(temp,target,result);
			if (temp.left != null){
				s.offer(temp.left);
            }
			if (temp.right != null){
				s.offer(temp.right);
            }
		}
		
	}
	public static void checkValue(TreeNode root, int target,ArrayList<Integer> result){
        
		if(root == null){
			return ;
		}
		if(target== root.val){
            
			for(int i = 0;i < result.size();i++){
				System.out.print(result.get(i));
			}
			System.out.print(target);
			System.out.println("");
		}
		if(root == null){
			return ;
		}
		
		if(root.left != null){
			result.add(root.val);
			checkValue(root.left,target-root.val,result);
			result.remove(result.size()-1);
		}
		if(root.right != null){
			result.add(root.val);
			checkValue(root.right,target-root.val,result);
			result.remove(result.size()-1);
		}
	}
}
