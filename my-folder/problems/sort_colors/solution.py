class Solution:

    def swap(self,nums: List[int],ele1: int,ele2: int) -> None:
        temp = nums[ele1]
        nums[ele1] = nums[ele2]
        nums[ele2] = temp

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        if len(nums) <= 1:
            return

        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums,low,mid) 
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                self.swap(nums, mid, high)
                high -= 1

        