class Solution {
    public boolean isAnagram(String s, String t) {
        //O(n) approach
        if(s.length()!=t.length()) return false; //return false if length don't match
        int[] freq=new int[26]; //initialise frequency array
        //increment characters of s
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        //decrement characters of t
        for(int j=0;j<t.length();j++){
            freq[t.charAt(j)-'a']--;
        }
        //if both are anagrams, all frequencies should be zero
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
        
}