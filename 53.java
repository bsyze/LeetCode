53. 最大子序和
//动态规划猛地一批
class Solution {
    public int maxSubArray(int[] nums) {
        int[]s=new int[nums.length];
        int max=nums[0];
        s[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            s[i]=nums[i];
            if(nums[i]+s[i-1]>0&&s[i-1]>0)
                s[i]=s[i-1]+nums[i];
            if(s[i]>max)
                max=s[i];
        }
        return max;
    }
}
