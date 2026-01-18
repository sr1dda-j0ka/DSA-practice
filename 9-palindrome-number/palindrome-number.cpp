class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            int n=x;
            long int reverse=0;
            while(n>0){
                reverse=reverse*10+(n%10);
                n/=10;
            }
            if(reverse==x) return true;
            else return false;
        }
    }
};