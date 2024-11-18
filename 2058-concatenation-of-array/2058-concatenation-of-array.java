class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] ans = new int[len];
        int n = len / 2;
        int i = 0;
        while (i < len) {
            if (i <= n - 1) {
                ans[i] = nums[i];
            }
            else {
                ans[i] = nums[i-n];
            }
            i++;
        }
        return ans;
    }
}