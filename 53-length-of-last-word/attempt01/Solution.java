class Solution {
    public int lengthOfLastWord(String s) {
        char[] SArr = s.toCharArray();
        int count = 0;
        boolean lastLetter = false;

        for (int i = (s.length() - 1); i >= 0; i--) {
            if (lastLetter && (SArr[i] == ' ')) {
                return count;
            }
            if (!lastLetter && (SArr[i] != ' ')) {
                lastLetter = true;
            }
            if (SArr[i] != ' ') {
                count++;
            }
        } 
        return -1;
    }
