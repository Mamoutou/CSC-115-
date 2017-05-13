package assignment6;

public class Node {
	char data;
	Node left;
	Node right;

	public Node() {
		data = ' ';
		left = null;
		right = null;
	}

	public Node(char dataPortion) {
		data = dataPortion;
		left = null;
		right = null;
	}

	public void setData(char newData) {
		data = newData;
	}

	public char getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node newLeft) {
		left = newLeft;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node newRight) {
		right = newRight;
	}

	public boolean hasLeft() {
		return left != null;
	}
	public boolean hasRight() {
		return right != null;
	}
}