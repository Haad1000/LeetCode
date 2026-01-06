class Solution {
    public int removeDuplicates(int[] nums) {
        int oldlen = nums.length;
        int returnValue = 1;

        for (int i = 1; i < oldlen; i++) {

            if (nums[i] != nums[i - 1]) {
                returnValue++;
            } else {
                for (int j = i + 1; j < oldlen; j++) {
                    nums[j-1] = nums[j];
                }
                oldlen--;
                i--;
            }
        }

        return returnValue;
    }
}