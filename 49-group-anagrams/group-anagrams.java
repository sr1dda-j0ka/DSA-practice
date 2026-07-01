class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArr=strs[i].toCharArray();
            Arrays.sort(charArr);
            String sorted=String.valueOf(charArr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }else{
                map.put(sorted,new ArrayList<>(List.of(strs[i])));
            }
        }
        for(List val:map.values()) result.add(val);
        return result;
        
    }
}