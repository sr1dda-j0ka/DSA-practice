class Solution {
    //Idea is to use two pointers to compare from one end to other
    public boolean isPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){ //check and move when non-alphanumeric character
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){ //check and move for non-alphanumeric character
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){//compare both ends 
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}