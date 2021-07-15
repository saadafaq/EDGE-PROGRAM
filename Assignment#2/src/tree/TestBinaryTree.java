package tree;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.push(36);
		tree.push(30);
		tree.push(25);
		tree.push(15);
		tree.push(12);
		tree.push(10);
		BinaryTreeNode node = tree.convertList2Binary(tree.root);

		System.out.println("Inorder Traversal of the" + " constructed Binary Tree is:");
		tree.inorderTraversal(node); // Left -> Root -> RIGHT
	}
}
