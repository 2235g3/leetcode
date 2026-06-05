public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4}; // Inits nums array
        int[] sumNums = runningSum(nums); // Inits an array to allow display
        for (int i:sumNums) { // Loops through sumNums array and displays each value
            System.out.println(i);
        }
    }
    public static int[] runningSum(int[] nums) {
        int[] sumNums = new int[nums.length]; // Inits sumNums array
        for (int i = 0; i < nums.length; i++) { // Loops through each index position in nums array
            int sum = 0; // Resets sum each loop
            for (int j = 0; j <= i; j++) { // Loops through all previous (and current) index positions, creating a total
                sum += nums[j];
            }
            sumNums[i] = sum; // Saves the sum into the sumNums array
        }
        return sumNums;
    }
}