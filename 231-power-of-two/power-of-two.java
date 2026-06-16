class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        double product=n;
        while(product>=1){
            product/=2;
            if(product==1){
                return true;
            }
        }
        return false;
    }
}