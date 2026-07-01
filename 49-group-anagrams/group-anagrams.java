class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //O(n.klogk) time and O(n.k) space
        //Sort the string and store sorted string as key and normal strings as elements in list as value
        //Iterate and give the result in the end
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