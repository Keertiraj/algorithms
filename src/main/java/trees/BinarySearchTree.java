/**
 *  Binary Search Tree: It takes the benefits of better search capabilities of sorted Arrays and better insert/delete capabilities of Linked List.
   - TO BE a binary Tree, following criterias need to be met:

	a. Binary Tree

	b. Left subtrees are less than parent

	c. Right subtrees are greater than parent

 */

package trees;

public class BinarySearchTree<E extends Comparable<? super E>> {

	TreeNode<E> root;

	/**
	 * Method to find the Element in a Binary Search Tree.
	 * 
	 * @param toFind
	 * @return boolean
	 */
	public boolean contains(E toFind) {

		TreeNode<E> curr = root;
		int cmp;

		while (curr != null) {

			cmp = toFind.compareTo(curr.getData());
			if (cmp < 0) {

				curr = curr.getLeftChild();

			} else if (cmp > 0) {

				curr = curr.getRightChild();

			} else
				return true;

		}

		return false;

	}

	/**
	 * Method to insert an Element in a Binary Search Tree.
	 * 
	 * @param toInsert
	 * @return boolean
	 */
	public boolean insert(E toInsert) {

		TreeNode<E> curr = root;

		int cmp = toInsert.compareTo(curr.getData());

		while (cmp < 0 && curr.getLeftChild() != null || cmp > 0
				&& curr.getRightChild() != null) {

			if (cmp < 0) {
				curr = curr.getLeftChild();
			}
			curr = curr.getRightChild();

			cmp = toInsert.compareTo(curr.getData());

		}

		if (cmp < 0) {
			curr.addLeftChild(toInsert);
		} else if (cmp > 0) {
			curr.addRighChild(toInsert);
		} else
			return false;

		return true;

	}

}