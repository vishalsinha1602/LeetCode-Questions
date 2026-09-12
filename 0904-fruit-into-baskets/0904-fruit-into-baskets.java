class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int left=0;
        int maxLength=0;

        for(int right=0;right<fruits.length;right++)
        {
            int fruit = fruits[right]; // right wala fruit lo

            if(map.containsKey(fruit)) //agr hai already
            {
                // toh map me (fruit,frequency) daal do 
                map.put(fruit,map.get(fruit)+1);
            }else
            {
                //agr nhi hai toh put kr do 
                map.put(fruit, 1);
            }

            // ab check krenge ki agr map ka size greater that 2 hua toh

            while(map.size()>2)
            {

                // frequency minus krte jao 
                map.put(fruits[left],map.get(fruits[left])-1);
                // fruit[left] remove kr do agr uska frequency zero ho gya toh
                if(map.get(fruits[left])==0)
                    map.remove(fruits[left]);

                left++;
            }

            int length= right-left+1;
            maxLength=Math.max(maxLength,length);

        }

        return maxLength;
    }
}