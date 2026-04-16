class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        s=s.toLowerCase();
        t=t.toLowerCase();
        int []arr = new int[26];
        for(int i=0; i<s.length(); i++){        //i=0;
            char ch = s.charAt(i);          //ch = r
            arr[ch - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int a : arr){
            if(a != 0)      return false;
        }
        return true;
    }
}
