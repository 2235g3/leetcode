class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        int tail = 0;
        boolean valid = false;
        for (char p : s.toCharArray()) {
            if (p == '(' || p == '[' || p == '{') {
                stack[tail++] = p;
                valid = false;
            } else if (tail == 0) {
                return false;
            } else if (p != map.get(stack[--tail])) {
                return false;
            } else {
                valid = true;
            }
        }
        if (tail != 0) {
            return false;
        }
        return valid;
    }
}

