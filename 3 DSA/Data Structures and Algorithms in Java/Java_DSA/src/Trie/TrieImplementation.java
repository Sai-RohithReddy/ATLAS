package Trie;

public class TrieImplementation {
	
	private TrieNode root;
	
	public TrieImplementation() {
		root = new TrieNode();
	}
	
	public class TrieNode {
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isWord = false;
		}
	}
	
	public void insert(String word) {
		if (word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		word = word.toLowerCase();
		
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			} else {
				current = current.children[index];
			}
		}
		current.isWord = true;
	}
	
	public static void main(String[] args) {
		
		TrieImplementation trie = new TrieImplementation();
		
		trie.insert("cat");
		trie.insert("cab");
		trie.insert("son");
		trie.insert("so");
		
		System.out.println("Value inserted successfully !!!");
	}
}
