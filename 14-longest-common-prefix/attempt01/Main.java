class Solution {
    public String longestCommonPrefix(String[] strs) {
        int smallest = strs[0].length();
        for (String str : strs) {
            smallest = Math.min(smallest, str.length());
        }
        for (int i = 0; i < smallest; i++) {
            char refChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != refChar) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,smallest);
    }
}