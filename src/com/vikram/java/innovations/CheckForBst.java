package com.vikram.java.innovations;


/*NOTE: This approach gives wrong results*?
 * 
 */
public class CheckForBst {
	
	private BinaryTree tree;
	
	public CheckForBst (BinaryTree tree) {
		this.tree = tree;
	}
	
	public boolean isBinarySearchTree () {
		//return isBinarySearchTree (tree.getRoot());
		return isBinarySearchTree (tree.getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	//CORRECT APPROACH: (from http://stackoverflow.com/questions/4575406/check-if-a-tree-is-a-binary-search-tree)
	public boolean isBinarySearchTree(Node node, int minValue, int maxValue) {
		if(node == null)
	         return true;
	     if(node.getKey() > minValue 
	         && node.getKey() < maxValue
	         && isBinarySearchTree(node.getLeft(),minValue,node.getKey())
	         && isBinarySearchTree(node.getRight(),node.getKey(),maxValue))
	         return true;
	     else 
	         return false;
	}

	//Note: Following approach has some flaws
	public boolean isBinarySearchTree(Node node) {

		
		
		/*if(node == null) {
			return true;
		}
		
		if (node.getLeft() != null && node.getLeft().getKey() >= node.getKey()) {
			return false;
		}
		
		if (node.getRight() != null && node.getRight().getKey() < node.getKey()) {
			return false;
		}
		
		if(isBinarySearchTree(node.getLeft()) && isBinarySearchTree(node.getRight())) {
			return true;
		}*/
						
		return false; //Note: Initially, I forgot to write this. So, don't forget to write this
		
	}

}
