package trees;

public class TreeNode<E> {

	private E value;
	private TreeNode<E> parent;
	private TreeNode<E> leftChild;
	private TreeNode<E> righChild;

	public TreeNode(E val, TreeNode<E> par) {

		this.value = val;
		this.parent = par;
		this.leftChild = null;
		this.righChild = null;

	}
	
	public E getData(){
		
		return value;
	}

	public TreeNode<E> addLeftChild(E val) {

		this.leftChild = new TreeNode<E>(val, this);

		return this.leftChild;

	}

	public TreeNode<E> getParent() {
		return parent;
	}

	public void setParent(TreeNode<E> parent) {
		this.parent = parent;
	}

	public TreeNode<E> getLeftChild() {
		return leftChild;
	}

	public TreeNode<E> getRightChild() {
		return righChild;
	}

	public TreeNode<E> addRighChild(E val) {
		this.righChild = new TreeNode<E>(val, this);

		return this.righChild;
	}

	public void visit() {
        
		System.out.println(this.value);
		
	}
}
