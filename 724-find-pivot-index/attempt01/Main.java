public class Main {
    public static void main(String[] args) {
        int[] nums = {2,1,-1}; // Inits the array
        System.out.println(pivotIndex(nums)); // Prints the index
    }
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // Loops through index positions of nums array
            int left = 0;
            int right = 0;
            if (i + 1 < nums.length) { // Ensures the for loop can run without being out of range, keeping the right total at 0
                for (int j = i + 1; j < nums.length; j++) { // Loops through the right side, creating a total
                    right += nums[j];
                }
            }
            if (i > 0) { // Ensures that when checking the first index position the left total stays at 0
                for (int j = 0; j < i; j++) { // Loops through the left side, creating a total
                    left += nums[j];
                }
            }
            if (left == right) { // If both totals are the same, they return the current index
                return i;
            }
        }
        return -1; // If no index position meets the conditions, returns -1
    }
}