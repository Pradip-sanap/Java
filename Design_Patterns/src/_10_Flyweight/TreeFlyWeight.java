package _10_Flyweight;

import java.util.HashMap;
import java.util.Map;

class TreeFactory {
	private static final Map<String, TreeType> treeMap = new HashMap<>();

	public static TreeType getTree(String type) {
		TreeType tree = treeMap.get(type);

		if (tree == null) {
			if ("Oak".equalsIgnoreCase(type)) {
				tree = new OakTree();
			} else if ("Pine".equalsIgnoreCase(type)) {
				tree = new PineTree();
			}
			treeMap.put(type, tree);
			System.out.println("Creating new tree type: " + type);
		}
		return tree;
	}
}
