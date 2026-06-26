class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowelMap=new HashMap<>();
        HashMap<Character,Integer> consonantMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                if(vowelMap.containsKey(c)){
                    vowelMap.put(c,vowelMap.get(c)+1);
                }else{
                    vowelMap.put(c,1);
                }
            }
            else{
                if(consonantMap.containsKey(c)){
                    consonantMap.put(c,consonantMap.get(c)+1);
                }else{
                    consonantMap.put(c,1);
                }
            }
        }
        int maxVowel=0;
        int maxConsonant=0;
        for(char c:vowelMap.keySet()){
            maxVowel=Math.max(maxVowel,vowelMap.get(c));
        }
        for(char c:consonantMap.keySet()){
            maxConsonant=Math.max(maxConsonant,consonantMap.get(c));
        }
        return maxVowel+maxConsonant;
    }
}