class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        totalLen = len(nums)

        if (totalLen <= 0):
            return 0
        if (totalLen == 1):
            if nums[0] == val:
                return 0
                del nums[0]
            else:
                return 1

        counter = 0
        output = []

        for i in range(totalLen):
            if nums[i] != val:
                output.append(nums[i])
            else:
                counter += 1

        nums[:] = output

        # for i in range(totalLen):
        #     if nums[i] == val:
        #         # counter += 1
        #         found = False
        #         for j in range(totalLen-1, i, -1):
        #             if nums[j] != val:
        #                 temp = nums[i]
        #                 nums[i] = nums[j]
        #                 nums[j] = temp
        #                 counter += 1
        #                 found = True
        #                 break
        # for i in nums:
        #     if i == val:
        #         counter += 1
        #         for j in nums[::-1]:
        #             if j != val:
        #                 i = j
        
        return totalLen - counter
        # return counter
                