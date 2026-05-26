class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        backtrack(candidates,0,comb,result,target);
        return result;
    }
    private void backtrack(int[] candidates,int i,List<Integer> comb,List<List<Integer>> result,int target){
        if(target==0){
            result.add(new ArrayList<>(comb));
            return;
        }
        if(i==candidates.length||target<0){
            return;
        }
        comb.add(candidates[i]);
        backtrack(candidates,i,comb,result,target-candidates[i]);
        comb.remove(comb.size()-1);
        backtrack(candidates,i+1,comb,result,target);
    }
}