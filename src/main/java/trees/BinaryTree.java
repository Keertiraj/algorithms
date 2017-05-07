package trees;

public class BinaryTree<E> {

	TreeNode<E> root;

	/*
	 * Binary Tree: Pre-Order Depth First Traversal implementation.
	 */

	private void preOrder(TreeNode<E> node) {

		if (node != null) {
			node.visit();
			preOrder(node.getLeftChild());
			preOrder(node.getRightChild());

		}

	}

	public void preOrder() {
		this.preOrder(root);
	}

}
