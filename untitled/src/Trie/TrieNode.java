package Trie;

public class TrieNode {
    char data;
    TrieNode[] children;
    boolean isend;

    TrieNode(char data) {
        this.data = data;
        children = new TrieNode[26];
        isend = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}
