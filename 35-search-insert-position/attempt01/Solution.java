class Solution {
    public int searchInsert(int[] nums, int target) {
        return recurse(nums, 0, (nums.length - 1), target)[0];
    }
    public int[] recurse(int[] arr, int left, int right, int target) {
        int mid = (left + right) / 2;
        if (left == right) {
            if (arr[mid] < target) {
                return new int[] {mid + 1};
            }
            else if (arr[mid] > target) {
                return new int[] {mid};
            }
        }
        if (arr[mid] == target) {
            return new int[] {mid};
        }
        if (arr[mid] < target) {
            left = mid + 1;
            return recurse(arr, left, right, target);
        }
        else if (arr[mid] > target) {
            right = mid;
            return recurse(arr, left, right, target);
        }  
        return new int[] {0};
    }
}
