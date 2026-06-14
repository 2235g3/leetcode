class Solution {
    public int romanToInt(String s) {
        String[] numerals = {"M","D","C","L","X","V","I"};
        int[] ints = {1000,500,100,50,10,5,1};
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentIndex = indexFind(i,numerals,s);
            if (i + 1 != s.length()) {
                int nextIndex = indexFind(i + 1, numerals, s);            
                if (currentIndex > nextIndex) {
                    total -= ints[currentIndex];
                }
                else {
                    total += ints[currentIndex];
                }
            }
            else {
                total += ints[currentIndex];
            }
        }
        return total;
    }
    public static int indexFind(int i, String[] numerals, String s) {
        for (int j = 0; j < numerals.length; j++) {
            if (numerals[j].equals(s.substring(i, i+1))) {
                return j;
            }
        }
        return 0;
    }
}