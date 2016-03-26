package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LongestPath {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] inputA = br.readLine().split(" ");
		Map<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
		for (int i = 1; i < inputA.length + 1; i++) {
			map.put(i, new TreeNode(Integer.parseInt(inputA[i - 1].trim())));
		}
		String[] inputB = br.readLine().split(" ");
		for (int i = 1; i < inputB.length + 1; i++) {
			TreeNode pnode = map.get(Integer.parseInt(inputB[i - 1].trim()));
			TreeNode cnode = map.get(i + 1);
			cnode.parent = pnode;
			pnode.setHasChild(true);
		}
		int maxLong = 0;
		for (int i = 1; i < inputA.length + 1; i++) {
			if (!map.get(i).isHasChild()) {
				TreeNode leafNode = map.get(i);
				int currentlong = getLongestSumOfLeafToRoot(leafNode);
				maxLong = max(maxLong, currentlong);
			}
		}
		System.out.println(maxLong);
	}

	private static int getLongestSumOfLeafToRoot(TreeNode leafNode) {
		int maxLong = 0;
		int curLong = 0;
		TreeNode temp = makeClone(leafNode);
		while (temp.parent != null) {
			if (temp.color == 0)
				curLong = 0;
			else
				curLong++;
			maxLong = max(maxLong, curLong);
			temp=temp.parent;
		}
		return maxLong;
	}

	private static TreeNode makeClone(TreeNode leafNode) {
		TreeNode n = new TreeNode(leafNode.color, leafNode.parent);
		n.setHasChild(leafNode.isHasChild());
		return n;
	}

	private static int max(int i, int j) {
		if (i >= j)
			return i;
		return j;
	}
}

class TreeNode {
	int color;
	TreeNode parent;
	boolean hasChild = false;

	public TreeNode(int color) {
		this.color = color;
		this.parent = null;
	}

	public TreeNode(int color, TreeNode parent) {
		this.color = color;
		this.parent = parent;
	}

	public boolean isHasChild() {
		return hasChild;
	}

	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}

}

