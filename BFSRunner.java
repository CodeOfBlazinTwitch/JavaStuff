package bfs;

import java.util.LinkedList;

public class BFSRunner {

	public static boolean Find(Node source, Node destination) {

		LinkedList<Node> toVisit = new LinkedList<Node>();

		toVisit.add(source);

		while (!toVisit.isEmpty()) {

			Node node = toVisit.remove();

			if (node == destination) {

				return true;

			}

			for (Node child : node.children) {

				toVisit.add(child);

			}

		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);

		node3.AddChild(node1);
		node3.AddChild(node2);
		node3.AddChild(node4);

		node2.AddChild(node5);

		node4.AddChild(node6);

		node6.AddChild(node7);

		System.out.println(Find(node3, node8));

	}

}
