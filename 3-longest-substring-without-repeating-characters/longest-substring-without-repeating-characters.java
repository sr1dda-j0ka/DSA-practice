class Solution {
    //Sliding Window Pattern

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map=new HashMap<>(); //Declare a hashmap 

        int left=0,right=0,diff=0; //Initialize two pointers left and right and diff which stores final ans

        while(right<s.length()){ //run a while loop till right pointer reaches end of the string
            if(map.containsKey(s.charAt(right))){ //if already present in the map(repeating letter found) 
                left=Math.max(left,map.get(s.charAt(right))+1);//move left pointer beyond the repeating character
            }
            diff=Math.max(diff,right-left+1); //check for maximum length of string at every step
            map.put(s.charAt(right),right);//keep adding the characters with their indices to the hashmap
            right++;
        }
        
        return diff;

    }
}