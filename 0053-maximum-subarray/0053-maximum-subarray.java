class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum =0;
        int max_sm = nums[0];

        for(int i = 0 ;i<nums.length;i++){
            sum+=nums[i];
            if (sum>0){max_sm = Math.max(max_sm,sum);}
            if(sum<=0){
                max_sm = Math.max(max_sm,sum);
                sum=0;}
                 
                 
        }return max_sm;
    }
}