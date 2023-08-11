import java.util.ArrayList;

public class ShortestDistanceOccurrences {
    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String target = "makes";
        ArrayList<Integer> arr = new ArrayList<>();
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                arr.add(i);
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            res = Math.abs(res - arr.get(i));
        }
        System.out.println(res);
    }
}