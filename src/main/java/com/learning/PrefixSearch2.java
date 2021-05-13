package com.learning;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch2 {
    public static final int SIZE = 26;

    static class TrieNode {

        TrieNode[] Child = new TrieNode[SIZE];

        // isLeaf is true if the node represents
        // end of a word
        boolean leaf;
        List<Integer> indexLocations = new ArrayList<>();

        // Constructor
        public TrieNode() {
            leaf = false;
            for (int i = 0; i < SIZE; i++)
                Child[i] = null;
        }
    }

    // If not present, inserts key into trie
    // If the key is prefix of trie node, just
    // marks leaf node
    public static void insert(TrieNode root, String Key, int location) {
        int n = Key.length();
        TrieNode pChild = root;

        for (int i = 0; i < n; i++) {
            int index = Key.charAt(i) - 'a';

            if (pChild.Child[index] == null)
                pChild.Child[index] = new TrieNode();

            pChild = pChild.Child[index];
            pChild.indexLocations.add(location);
        }

        // make last node as leaf node
        pChild.leaf = true;
    }

    public static List<Integer> containsNode(TrieNode root, String word) {
        TrieNode pChild = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (pChild.Child[index] != null) {
                pChild = pChild.Child[index];
            } else {
                return null;
            }
        }
        return pChild.indexLocations;
    }

    public static void main(String[] args) {

        TrieNode t = new TrieNode();

        String[] s = "a aa Aaa abca bca".split(" ");
        int location = 0;
        for (String word : s) {
            insert(t, word.toLowerCase(), location);
            location += word.length() + 1;
        }
        System.out.println(containsNode(t, "a"));
        System.out.println(containsNode(t, "bc"));
        System.out.println(containsNode(t, "aA".toLowerCase()));
        System.out.println(containsNode(t, "abc"));
    }
}
