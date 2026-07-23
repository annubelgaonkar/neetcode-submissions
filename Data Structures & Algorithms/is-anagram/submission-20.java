class Solution {
    public boolean isAnagram(String s, String t) {
        int []arr = new int[26];
        
        if(s.length() != t.length()){
            return false;
        }
        int i=0, j=0;
        while(i < s.length() && j < t.length()){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(j) - 'a']--;
            i++;
            j++;
        }

        for(int num : arr){
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
}
