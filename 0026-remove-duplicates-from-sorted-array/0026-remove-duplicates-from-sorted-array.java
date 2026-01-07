class Solution {
    public int removeDuplicates(int[] nums) {
        int oldlen = nums.length;
        int returnValue = 1;
        int[] newNums = new int[oldlen];
        int counter = 1;
        newNums[0] = nums[0];

        for (int i = 1; i < oldlen; i++) {

            if (nums[i] != nums[i - 1]) {
                returnValue++;
                newNums[counter] = nums[i];
                counter++;
            } 
        }

        System.arraycopy(newNums, 0, nums, 0, returnValue);

        return returnValue;
    }
}