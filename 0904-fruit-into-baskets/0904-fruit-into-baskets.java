class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> map =  new HashMap<>();

        int left =0;
        int maxLength=0;

        for(int right =0;right<=fruits.length-1;right++)
        {
            int fruit = fruits[right];

            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            } else {
                map.put(fruit, 1);
            }

            while (map.size() > 2) {

                int leftFruit = fruits[left];

                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                left++;
            }

        int length =right-left+1;

        maxLength=Math.max(maxLength,length);

       }

     return maxLength;
        
    }
}