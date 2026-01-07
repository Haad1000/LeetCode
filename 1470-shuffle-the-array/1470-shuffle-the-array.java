class Solution {
    public int[] shuffle(int[] nums, int n) {

        if (n <= 1) {
            return nums;
        }

        int[] xVals = new int[n];
        int[] yVals = new int[n];
        int counter = 0;

        System.arraycopy(nums, 0, xVals, 0, n);
        System.arraycopy(nums, n, yVals, 0, n);

        for (int i = 0; i < n; i++) {
            nums[counter++] = xVals[i];
            nums[counter++] = yVals[i];
        }

        return nums;
    }
}