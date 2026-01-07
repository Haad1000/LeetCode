class Solution {
    public int removeElement(int[] nums, int val) {

        int counter = 0;
        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newArray[counter] = nums[i];
                counter++;
            }
        }

        System.arraycopy(newArray, 0, nums, 0, newArray.length);

        return counter;
    }
}