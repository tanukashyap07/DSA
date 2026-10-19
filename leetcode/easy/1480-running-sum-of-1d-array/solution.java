class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        int[] tanu = new int[n];
        tanu[0]=nums[0];
        for(int i=1;i<n;i++)
            tanu[i]=tanu[i-1]+nums[i];
            return tanu;
        
        
 }
}