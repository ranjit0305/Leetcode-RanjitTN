long long zeroFilledSubarray(int* nums, int numsSize) {
    long long sum = 0;
    long long cnt = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == 0) {
            cnt++;
            sum += cnt;
        } else {
            cnt = 0;
        }
    }
    return sum;
}
