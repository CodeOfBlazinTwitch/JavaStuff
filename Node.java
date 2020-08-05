package bfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

	public int NodeId;
	public Node name;

	List<Node> children = new ArrayList<>();

	public Node(int nodeId) {
		super();
		NodeId = nodeId;
	}

	public void SetName(Node name) {

		this.name = name;

	}

	public void AddChild(Node node) {

		children.add(node);

	}

}
