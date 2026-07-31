class Solution {
    public String reverseWords(String s) {
        String[] strArr=s.trim().split("\\s+");
        String res="";
        int left=0,right=strArr.length-1;
        while(left<right){
            String temp=strArr[right];
            strArr[right]=strArr[left];
            strArr[left]=temp;
            left++;
            right--;
        }

        for(int i=0;i<strArr.length-1;i++){
            res+=strArr[i];
            res+=" ";
        }
        res+=strArr[strArr.length-1];
        return res;
    }
}