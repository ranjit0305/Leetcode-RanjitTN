#include <stdlib.h>

int compare(const void* a, const void* b)
{
    return (*(int*)a - *(int*)b);
}

int minRemoval(int* nums, int numsSize, int k)
{
    if (numsSize == 1)
        return 0;

    qsort(nums, numsSize, sizeof(int), compare);

    int start = 0;
    int maxLen = 1;

    for (int end = 0; end < numsSize; end++)
    {
        while ((long long)nums[end] > (long long)nums[start] * k)
        {
            start++;
        }

        int currLen = end - start + 1;
        if (currLen > maxLen)
            maxLen = currLen;
    }

    return numsSize - maxLen;
}
