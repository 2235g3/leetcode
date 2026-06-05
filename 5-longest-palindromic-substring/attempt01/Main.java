public class Main {
    public static void main(String[] args) {
        String s = "aacabdkacaa";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String palindrome = Character.toString(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            String tempPalindrome = "";
            for (int j = i; j < s.length(); j++) {
                if (count == 0) {
                    if (s.charAt(j) == s.charAt(s.length() - 1 - count)) {
                        tempPalindrome += s.charAt(j);
                    }
                }
                else {
                    if (s.charAt(j) == s.charAt(s.length() - count)) {
                        tempPalindrome += s.charAt(j);
                    }
                }
                if (tempPalindrome.length() > palindrome.length()) {
                    palindrome = tempPalindrome;
                }
                count++;
            }
        }
        for (int i = s.length() - 1; i > 0; i--) {
            int count = 0;
            String tempPalindrome = "";
            for (int j = i; j >= 0; j--) {
                if (s.charAt(count) == s.charAt(j)) {
                    tempPalindrome += s.charAt(j);
                }
                if (tempPalindrome.length() > palindrome.length()) {
                    palindrome = tempPalindrome;
                }
                count++;
            }
        }
        return palindrome;
    }
}