class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if (len(nums) <= 0):
            return 0
        
        counter = 1

        for i in range (counter, len(nums)):
            if nums[i] != nums[i-1]:
                nums[counter] = nums[i]
                counter += 1
        
        return counter