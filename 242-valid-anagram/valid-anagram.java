class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            arr1[n]++;
        }
        for(int i=0;i<t.length();i++){
            int n=t.charAt(i)-'a';
            arr2[n]++;
        }
        return Arrays.equals(arr1,arr2);


    }
}