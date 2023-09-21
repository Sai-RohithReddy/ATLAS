import java.util.ArrayList;

class TrieImplementation {

	private TrieNode root;

	public TrieImplementation() {
		root = new TrieNode();
	}

	public TrieNode getRoot() {
		return this.root;
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

		word = word.toLowerCase();

		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (current.children[index] == null) {
				current.children[index] = new TrieNode();
			}
			current = current.children[index];

		}
		current.isWord = true;
	}

	public ArrayList<String> autoComplete(String prefix) {

		prefix = prefix.toLowerCase();
		ArrayList<String> suggestion = new ArrayList<>();
		TrieNode node = findNode(prefix);

		if (node != null) {
			collectWords(node, prefix, suggestion);
		}

		if (suggestion.isEmpty()) {
			suggestion.add("No suggestions found!!");
		}

		return suggestion;
	}

	private TrieNode findNode(String prefix) {
		TrieNode current = root;

		for (int i = 0; i < prefix.length(); i++) {
			int index = prefix.charAt(i) - 'a';
			if (current.children[index] == null) {
				return null;
			}
			current = current.children[index];
		}

		return current;
	}

	private void collectWords(TrieNode node, String word, ArrayList<String> suggestions) {
		if (node.isWord) {
			suggestions.add(word);
		}
		for (int i = 0; i < 26; i++) {
			if (node.children[i] != null) {
				char ch = (char) (i + 'a');
				collectWords(node.children[i], word + ch, suggestions);
			}
		}
	}

	public void display(TrieNode root, char[] str, int level) {
		// if (root.isWord == true) {
		// for (int k = level; k < str.length; k++){
		// str[k] = 0;
		// }
		// System.out.println(str);
		// }

		if (root.isWord == true) {
			System.out.println(new String(str, 0, level));
		}

		for (int i = 0; i < 26; i++) {
			if (root.children[i] != null) {
				str[level] = (char) (i + 'a');
				display(root.children[i], str, level + 1);
			}
		}
	}
}

public class A1Trie {
    public static void main(String[] args) {

        TrieImplementation trie = new TrieImplementation();

        trie.insert("apple");
        trie.insert("appetizer");
        trie.insert("apartment");
        trie.insert("apache");
        trie.insert("banana");
        trie.insert("bat");
        trie.insert("dog");
        trie.insert("do");

        // trie.display(trie.getRoot(), new char[20], 0);

        ArrayList<String> suggestions = trie.autoComplete("app");
        for (String sug : suggestions) {
            System.out.println(sug);
        }
    }
}
