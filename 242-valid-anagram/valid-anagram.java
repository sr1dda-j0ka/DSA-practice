class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        if(String.valueOf(sarr).equals(String.valueOf(tarr))){
            return true;
        }else{
            return false;
        }
        

    }
        
}