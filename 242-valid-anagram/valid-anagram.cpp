class Solution {
public:
    bool isAnagram(string s, string t) {
        /* o(n) solution using hasmap:
        if(s.length()==t.length()){
            unordered_map<char,int>s_map;
            for(int i=0;i<s.length();i++){
                if (s_map.contains(s[i])){
                    s_map[s[i]]++;
                }else{
                    s_map[s[i]]=1;
                }
            }
            for(int i=0;i<t.length();i++){
                if(s_map.contains(t[i])){
                    if(s_map[t[i]]!=0) s_map[t[i]]--;
                    else return false;
                }else{
                    return false;
                }
            }
            return true;

        }else{
            return false;
        }
    }
    */
    //Most optimal solution:
        if(s.length()!=t.length()) return false;
        int arr[26]={0};
        for(char c: s){
            arr[c-'a']++;
        }
        for(char c: t){
            if(--arr[c-'a']<0) return false;
        }
        return true;
    }
};