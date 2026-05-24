class Solution {
    //Time Complexity O(n x n!) and space complexity O(n)
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used=new boolean[nums.length]; //used array to track the placement of array items
        List<List<Integer>> result=new ArrayList<>(); 
        backtrack(nums,new ArrayList<>(),used,result); //recursive call
        return result;
    }
    //recursive function -- remember to refer to the recursive tree
    private void backtrack(int[] nums,List<Integer> temp,boolean[] used,List<List<Integer>> result){

        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i]) continue;

            temp.add(nums[i]);
            used[i]=true;

            backtrack(nums,temp,used,result);

            temp.remove(temp.size()-1);
            used[i]=false;


        }
    }
}