class Solution {
    //Approach is to create a frequency array that stores the frequencies of all 26 alphabets in a string
    public boolean isAnagram(String s, String t) {
        int[] arr1=new int[26]; //frequency array for s
        int[] arr2=new int[26];//frequency array for t
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a'; //we update the frequency array
            arr1[n]++;
        }
        for(int i=0;i<t.length();i++){
            int n=t.charAt(i)-'a'; //we update the frequency array
            arr2[n]++;
        }
        return Arrays.equals(arr1,arr2); //compare the frequency array


    }
    //O(n) time complexity
}