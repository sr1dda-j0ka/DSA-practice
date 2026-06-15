class Solution {
    //Algorithm: Use a stack
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack=new ArrayDeque<>();
        int[][] arr=new int[position.length][2]; //use a 2-d array to track speed and positions
        for(int i=0;i<position.length;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]); //sort in descending order(closest to target)
        for(int i=0;i<position.length;i++){
            double time=(double) (target-arr[i][0])/arr[i][1]; //find time to reach target
            if(stack.isEmpty()||stack.peek()<time){ //If it takes less time than the top of stack, then fleet is formed
                stack.push(time);
            }else{
                continue;
            }
        }
        return stack.size();
    }
}