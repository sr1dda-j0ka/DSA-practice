class Solution {
    public int balancedStringSplit(String s) {
        //Simply iterate and count the numbers of l and r
        //when they become equal increase the count and covert the values to 0
        //return the count
        //Time: O(n) Space: O(1)
        int r=0,l=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{
                l++;
            }
            if(l==r){
                count++;
                l=0;
                r=0;
            } 
        }
        return count;
    }
}