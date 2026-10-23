class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int max_count = 0;
        int current_count = 0;
        int left = 0 ;
        int right = 0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right))>=left){left = map.get(s.charAt(right))+1;}
                
            
            map.put(s.charAt(right),right);
            current_count = right - left +1;
            max_count = Math.max(max_count , current_count);
            right++;
                
           
                
                 }
            else{
                map.put(s.charAt(right),right);
                current_count = right - left +1;
                max_count = Math.max(max_count , current_count);
                right++;
            }
            
        } 
        return max_count;
    }
}