class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        
        
        for(int con = 0;con<nums.length-1;con++){
            if(nums[con]<=0){
            if(con>0 && nums[con]==nums[con-1]){
                continue;}
            int left = con+1;
            int right=nums.length-1;
            
            while(left<right)
            {
             if(nums[left]+nums[right]+nums[con]==0){
                List<Integer> triplet = Arrays.asList(nums[left],nums[right],nums[con]);
                list.add(triplet);

                  right--;
                  left++;

            while(left < right && nums[left]==nums[left-1]){
                left++;
            }
            while(left < right && nums[right]==nums[right+1]){
                right--;
            }
            
            }
            
            else if(nums[left]+nums[right]+nums[con]<0)
            {
                left++;
                
            }
            else {
                right--;
            }

            }
        }
        else{
            break;
        }
    }

        
        return list;
       
    }
        
            
        }
    
