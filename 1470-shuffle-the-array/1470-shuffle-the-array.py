class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:

        totalLen = len(nums)
        halfLen = int(totalLen / 2)

        output = []

        for i in range(halfLen):
            output.append(nums[i])
            output.append(nums[i+halfLen])
        
        return output