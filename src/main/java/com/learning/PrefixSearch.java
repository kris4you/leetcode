package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class TrieNode {
    private final Map<Character, TrieNode> children = new HashMap<>();
    Character c;
    private List<Integer> indexLocation = new ArrayList<>();

    Map<Character, TrieNode> getChildren() {
        return children;
    }

    TrieNode(Character c) {
        this.c = c;
    }

    public List<Integer> getIndexLocation() {
        return indexLocation;
    }

    public void setIndexLocation(List<Integer> indexLocation) {
        this.indexLocation = indexLocation;
    }

    public void add(String word, Integer location) {
        if (c != null) {
            indexLocation.add(location);
        }
        if (word.length() > 0) {
            char c = word.charAt(0);
            children.putIfAbsent(c, new TrieNode(c));
            children.get(c).add(word.substring(1), location);
        }
    }

    List<Integer> containsNode(String word) {
        word = word.toLowerCase();
        if (word.length() > 0) {
            char c = word.charAt(0);
            if (children.containsKey(c)) {
                return children.get(c).containsNode(word.substring(1));
            } else {
                return new LinkedList<>();
            }
        }
        return indexLocation;
    }

}

public class PrefixSearch {

    public static void main(String[] args) {
        TrieNode t = new TrieNode(null);
        String[] s = "a aa Aaa abca bca".split(" ");
        int location = 0;
        for (String word : s) {
            t.add(word.toLowerCase(), location);
            location += word.length() + 1;
        }
        System.out.println(t.containsNode("a"));
        System.out.println(t.containsNode("bc"));
        System.out.println(t.containsNode("aA"));
        System.out.println(t.containsNode("abc"));
    }
}
