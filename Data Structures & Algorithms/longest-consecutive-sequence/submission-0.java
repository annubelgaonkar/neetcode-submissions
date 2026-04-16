class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int num : nums){
            set.add(num);
        }
         int numMinus = 0;
        for(int num : nums){
            int currLength=1;
            numMinus = num-1;
            while(set.contains(numMinus)){
                currLength++;
                set.remove(numMinus);
                numMinus = numMinus-1;
            }
            
            int numPlus = num + 1;
            while(set.contains(numPlus)){
                currLength++;
                set.remove(numPlus);
                numPlus = numPlus + 1;
            }
            set.remove(num);
            maxLen = Math.max(maxLen, currLength);
        }
        return maxLen;
    }
}
