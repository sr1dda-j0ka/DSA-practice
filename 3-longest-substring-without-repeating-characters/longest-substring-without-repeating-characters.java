class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,right=0,diff=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            diff=Math.max(diff,right-left+1);
            map.put(s.charAt(right),right);
            right++;
        }
        
        return diff;

    }
}