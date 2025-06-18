class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    ans[0] = findFirst(nums, target);
    ans[1] = findLast(nums, target);
    return ans;
}

public int findFirst(int[] nums, int target) {
    int start = 0, end = nums.length - 1, res = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            res = mid;
            end = mid - 1; // continue searching on left
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return res;
}

public int findLast(int[] nums, int target) {
    int start = 0, end = nums.length - 1, res = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            res = mid;
            start = mid + 1; // continue searching on right
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return res;
}
}