import java.util.*;

class TrieNode {
    private Map<Character, TrieNode> children;
    private boolean isEndofWord; 

    public TrieNode() {
        children = new HashMap<>();
        isEndofWord = false;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public boolean isEndofWord() { 
        return isEndofWord;
    }

    public void setEndofWord(boolean endofWord) {
        isEndofWord = endofWord;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.getChildren().putIfAbsent(ch, new TrieNode());
            current = current.getChildren().get(ch);
        }
        current.setEndofWord(true);
    }

    public List<String> autoComplete(String prefix) {
        List<String> suggestions = new ArrayList<>();
        TrieNode node = findNode(prefix, root); 

        if (node != null) {
            collectWords(node, prefix, suggestions);
        }

        return suggestions;
    }

    private TrieNode findNode(String prefix, TrieNode current) { 
        for (char ch : prefix.toCharArray()) {
            if (!current.getChildren().containsKey(ch)) {
                return null;
            }

            current = current.getChildren().get(ch);
        }
        return current;
    }

    private void collectWords(TrieNode node, String currentWord, List<String> suggestions) {
        if (node.isEndofWord()) {
            suggestions.add(currentWord);
        }

        for (char ch : node.getChildren().keySet()) {
            collectWords(node.getChildren().get(ch), currentWord + ch, suggestions);
        }
    }

    public static void main(String args[]) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("appetizer");
        trie.insert("ape");
        trie.insert("appraisal");
        trie.insert("banana");
        trie.insert("bat");
        trie.insert("cat");
        trie.insert("dog");

        String prefix = "ap";
        List<String> suggestions = trie.autoComplete(prefix);

        System.out.println("Suggestions with auto are for prefix '" + prefix + "':");
        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }
}