class Solution {
    public List<Integer> majorityElement(int[] nums) {        
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int x : nums)
            map.put(x, map.getOrDefault(x,0)+1);   


        for(int x : nums){
            if(map.get(x)>nums.length/3  && !list.contains(x)){
                list.add(x);
            }
        }

        Collections.sort(list);
        return list;
    }
}