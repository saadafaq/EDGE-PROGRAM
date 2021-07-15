package tree;

import java.util.LinkedList;
import java.util.Queue;

import linkedlist.Node;

public class BinaryTree {
	BinaryTreeNode root;
	LinkedList<Node> linkedList = new LinkedList<Node>();

	void push(int data) {
		Node newNode = new Node(data);

		if (linkedList.size() == 0) {
			linkedList.add(newNode);
		} else {
			linkedList.getLast().next = newNode;
			linkedList.add(newNode);
		}
	}

	BinaryTreeNode convertList2Binary(BinaryTreeNode node) {
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		Node head = linkedList.getFirst();

		if (head == null) {
			node = null;
			return null;
		}
		node = new BinaryTreeNode(head.data);
		q.add(node);

		head = head.next;

		while (head != null) {
			BinaryTreeNode parent = q.poll();

			BinaryTreeNode leftChild = null, rightChild = null;
			leftChild = new BinaryTreeNode(head.data);
			q.add(leftChild);
			head = head.next;
			if (head != null) {
				rightChild = new BinaryTreeNode(head.data);
				q.add(rightChild);
				head = head.next;
			}

			parent.left = leftChild;
			parent.right = rightChild;
		}

		return node;
	}

	void inorderTraversal(BinaryTreeNode node) {
		if (node != null) {
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			inorderTraversal(node.right);
		}
	}

}