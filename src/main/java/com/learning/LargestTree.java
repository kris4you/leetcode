package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LargestTree {

    public static Integer largestTree(final Map<Integer, Integer> parent) {

        Map<Integer, List<Integer>> chilMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> parentNode : parent.entrySet()) {

            List<Integer> childs = chilMap.getOrDefault(parentNode.getValue(), new ArrayList<>());
            childs.add(parentNode.getKey());
            chilMap.put(parentNode.getValue(), childs);
        }

        System.out.println(chilMap);
        int maxChild = 0;
        int maxResult = 0;
        for (Map.Entry<Integer, List<Integer>> tree : chilMap.entrySet()) {

            if (!parent.containsKey(tree.getKey())) {

                int size = treeSize(chilMap, tree.getKey(), tree.getValue());
                if (size > maxResult) {
                    maxChild = tree.getKey();
                    maxResult = size;
                } else if (size == maxResult) {
                    if (tree.getKey() < maxChild) {
                        maxChild = tree.getKey();
                    }
                }
            }
        }
        return maxChild;
    }

    private static int treeSize(Map<Integer, List<Integer>> chilMap, Integer key, List<Integer> value) {
        int result = 0;
        final Stack<Integer> stack = new Stack<>();
        stack.push(key);
        while (!stack.empty()) {
            final Integer childeren = stack.pop();
            result++;
            if (chilMap.get(childeren) != null) {
                chilMap.get(childeren).stream().forEach(k -> stack.push(k));
            }
        }
        return result;
    }

    public static void main(String[] args) {

        final Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);

        final Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(2, 3);
        map2.put(7, 8);
        map2.put(9, 8);
        map2.put(3, 1);
        map2.put(5, 12);
        map2.put(12, 15);
        map2.put(13, 15);
        map2.put(11, 15);
        map2.put(7, 8);

        System.out.println(largestTree(map));
        System.out.println(largestTree(map2));
    }
}
