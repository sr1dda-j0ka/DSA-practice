class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Use a HashSet to store the elements
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){ //check if the element already exists in the hashset 
                return true; //confirm duplicate presence
            }
            set.add(nums[i]); //add the element in the hashset
        }
        return false;
    }
}