class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> group = new HashMap<>();
        for(String str :strs){
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            group.computeIfAbsent(sorted,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(group.values());
            }
}