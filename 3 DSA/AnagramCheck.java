public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "saw";
        String s2 = "was";    
        System.out.println(isAnagram(s1, s2));
    }
    public static boolean isAnagram(String s1, String s2) {
        
        if (s1.length() != s2.length()) return false;
        
        int[] arr = new int[128];
        
        for (int i = 0; i < s1.length(); i++) {
            arr[(int)(s1.charAt(i))]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[(int)(s2.charAt(i))]--;
            if (arr[i] <= 0) {
                return true;
            }
        }
        return false;
    }
}
