class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Sort the array in lexicographical order
        //then compare the first and last string till one of them ends
        //keep track of result and return it in the end
        String result="";
        Arrays.sort(strs);
        String first=strs[0],last=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)) return result;
            result+=first.charAt(i);
        }
        return result;
    }
}