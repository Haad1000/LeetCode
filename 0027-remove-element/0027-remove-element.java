class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }
        int[] withVal = new int[counter];
        int valCounter = 0;
        int[] wihtoutVal = new int[nums.length - counter];
        int nonValCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                withVal[valCounter] = nums[i];
                valCounter++;
            }
            else {
                wihtoutVal[nonValCounter] = nums[i];
                nonValCounter++;
            }
        }
        System.arraycopy(wihtoutVal, 0, nums, 0, nonValCounter);
        System.arraycopy(withVal, 0, nums, nonValCounter, valCounter);
        return nums.length - counter;
    }
}