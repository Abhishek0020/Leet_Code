class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        st = set(nums)
        n = len(st)
        if n<3:
            return max(nums)
        return sorted(list(st))[-3]
        