class Solution {
    public String reverseStr(String s, int k) {
        //Time: O(n) Space: O(n)
        //Convert the string to character array
        //perform reversal between i=0 and i=k-1
        //then move 2k steps ahead
        //Pay attention to handling the last character
        char[] charArray=s.toCharArray();
        int step=2*k;
        for(int i=0;i<charArray.length;i+=step){
            int first=i,last=Math.min(i+k-1,charArray.length-1);
            while(first<last){
                char temp=charArray[first];
                charArray[first]=charArray[last];
                charArray[last]=temp;
                first++;
                last--;
            }
        }
        String result=String.valueOf(charArray);
        return result;

    }
}