class Solution {
    //Time Complexity: O(n) 
    public boolean containsDuplicate(int[] nums) {
        //Create a hashset
        HashSet set=new HashSet<>();
        //iterate and add elements to the hashset
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true; //if element already exists return true
            }
            set.add(nums[i]);
        }
        return false; //return false if repeating element not flagged
    }
}