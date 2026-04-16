class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[n+1];
   
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           
            int num = entry.getKey();
             int freq = entry.getValue();

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }  
            bucket[freq].add(num);                       
        }
        int res[] = new int[k];
        int counter=0;
        for(int i=bucket.length-1; i>=0 && counter<k; i--){
            if(bucket[i] != null){
                for(Integer num: bucket[i]){
                    res[counter++] = num;
                }
            }
        }
        return res;
    }
}
