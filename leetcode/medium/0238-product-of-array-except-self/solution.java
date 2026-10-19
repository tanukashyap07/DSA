class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] tanu = new int[n];

     
        tanu[0] = 1;

        for (int i = 1; i < n; i++) {
            tanu[i] = tanu[i - 1] * nums[i - 1];
        }

        
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            tanu[i] = tanu[i] * suffix;
            suffix = suffix * nums[i];
        }

        return tanu;
    }
}