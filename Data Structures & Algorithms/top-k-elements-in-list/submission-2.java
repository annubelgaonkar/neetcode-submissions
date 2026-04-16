class Solution {
    class Pair{
        int num;
        int count;

        Pair(int num, int count){
            this.num=num;
            this.count=count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            map.put(nums[i], 1);
        } 
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                 return Integer.compare(p2.count, p1.count);
            }           
    });

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            pq.add(new Pair(key, val));
        }        
        int i=0;
        int ans[] = new int[k];
        while(i<k){
            Pair rem = pq.poll();
            ans[i] = rem.num;
            i++;
        }
        return ans;
    }
}
