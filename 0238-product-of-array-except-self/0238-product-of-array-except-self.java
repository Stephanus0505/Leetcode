class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int [nums.length]; 
        Arrays.fill(arr,1);
        int prefix = 1;
        int post = nums[nums.length-1];
        

        for(int i =1;i<nums.length;i++){
            
            arr[i]=nums[i-1]*prefix;
            prefix =prefix * nums[i-1];


        }
        for(int j = nums.length-2;j>=0;j--){
             arr[j]=arr[j]*post;
             post = post*nums[j];
        }
        return arr;
        }

    }
