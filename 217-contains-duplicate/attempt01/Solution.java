class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> foundValues = new HashSet<Integer>();
        for (int num : nums) {
            if (foundValues.contains(num)) {
                return true;
            } 
            foundValues.add(num);
        }
        return false;
    }
}
