class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map_t= new HashMap<>();
        HashMap<Character, Integer> map_s = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(map_s.containsKey(s.charAt(i))){
                map_s.put(s.charAt(i), map_s.get(s.charAt(i)) +1 );
            }
            else    map_s.put(s.charAt(i), 1);

            if(map_t.containsKey(t.charAt(i))){
                map_t.put(t.charAt(i), map_t.get(t.charAt(i)) +1);
            }
            else map_t.put(t.charAt(i), 1);
        }
        return map_t.equals(map_s);
    }
}
