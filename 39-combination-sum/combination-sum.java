class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Stores all valid combinations
        List<List<Integer>> result = new ArrayList<>();

        // Current combination being built
        List<Integer> comb = new ArrayList<>();

        // Start recursion from index 0
        backtrack(candidates, 0, comb, result, target);

        return result;
    }

    private void backtrack(int[] candidates, int i, List<Integer> comb, List<List<Integer>> result, int target) {

        // ✅ Base Case 1: Target achieved
        // If target becomes 0, current combination is valid
        if (target == 0) {
            result.add(new ArrayList<>(comb)); // Add a COPY (important!)
            return;
        }

        // ❌ Base Case 2: Out of bounds OR target exceeded
        if (i == candidates.length || target < 0) {
            return;
        }

        // ================================
        // 🔁 CHOICE 1: TAKE current element
        // ================================

        comb.add(candidates[i]); 
        // Add current element to combination

        // Stay at same index 'i' → allows repetition
        backtrack(candidates, i, comb, result, target - candidates[i]);

        // 🔙 BACKTRACK
        // Remove last added element to explore other possibilities
        comb.remove(comb.size() - 1);

        // ================================
        // ⏭️ CHOICE 2: SKIP current element
        // ================================

        // Move to next index → cannot use current element anymore
        backtrack(candidates, i + 1, comb, result, target);
    }
}