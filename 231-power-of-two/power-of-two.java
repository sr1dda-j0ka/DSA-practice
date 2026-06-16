class Solution {
    public boolean isPowerOfTwo(int n) {
        //Loops can be used but optimal approach is bit manipulation
        return n>0 && (n&(n-1))==0;
    }
}