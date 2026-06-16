class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = (height.length - 1);
        int maxVol = (Math.min(height[left], height[right])) * (right - left);
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            maxVol = Math.max(maxVol, (Math.min(height[left], height[right]) * (right - left)));
        }
        return maxVol;
    }
}
