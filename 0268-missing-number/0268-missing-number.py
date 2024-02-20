class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        for i in range(0, n):
            if nums[i] != i:
                return i

        return n
