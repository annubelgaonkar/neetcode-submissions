class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();

        int freq[] = new int[26];
        for(int i=0;i<s.length(); i++){
            int ch1 = s.charAt(i) - 'a';
            freq[ch1]++;
        }
        //now decrement the counts in freq array
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }

        for(int frequency : freq){
            if(frequency != 0){
                return false;
            }
        }
        return true;
    }
}
