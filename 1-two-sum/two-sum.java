class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Time Complexity: O(n)
        //Initialize a hashmap and store the array element as key with index as value
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i]; //complement 
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i}; //if complement exist in the hashmap return the solution
            }else{
                map.put(nums[i],i); //else push the element with its index in the hashmap
            }
        }
        return new int[]{0};
    }
}