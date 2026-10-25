class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

       
        while(left<=right){
             int c = left+(right-left)/2;
            
            if(nums[c]==target){
                return c ;  
            }
            else if(target < nums[c] ){right = c-1 ; 
            
            }
            else if (target >nums[c]){left = c+1 ;
            }
        }
    return -1;}
}