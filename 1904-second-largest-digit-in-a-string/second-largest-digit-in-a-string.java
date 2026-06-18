class Solution {
    public int secondHighest(String s) {
        //Traverse the string and store second highest and highest values
        //Time Complexity: O(1) and Space Complexity: O(1)
        int highest=-1;
        int secondHighest=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (Character.isDigit(c)){
                int num=c-'0';
                if(num>highest){
                    secondHighest=highest;
                    highest=num;
                }
                if(num>secondHighest && num<highest){
                    secondHighest=num;
                }
            }
            
        }
        return secondHighest;
    }
}