class Solution {
    //Brute force approach: compare sum of every two elements with the target-O(n^2)
    //HashMap can be created to solve in O(n) approach
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>(); //create hashmap
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i]; //check the complement of the element
            if(map.containsKey(complement)){ //verify its existence in the hasmap
                return new int[] {map.get(complement),i}; //return the indices if the complement exists
            }
            else{
                map.put(nums[i],i); //save the element in the hashmap if not
            }
        }
        return new int[] {0,0}; //return zero array if answer doesn't exist
    }
}