class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Use two frequency maps and store the last occuring index
        //Time Complexity: O(n) Space: O(n)
        int[] freq1=new int[128];
        int[] freq2=new int[128];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(freq1[ch1]!=freq2[ch2]) return false;
            freq1[ch1]=i+1;
            freq2[ch2]=i+1;
        }
        return true;
    }
}