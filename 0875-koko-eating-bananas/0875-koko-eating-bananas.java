class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high=0;
          for (int num : piles) {
            high = Math.max(high, num);
        }

        while(low<=high)
        {
            int mid = low+(high-low)/2;

            double reqTime = toEat(piles,mid);
            
            if(reqTime<=h)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }

        return low;


        
    }

    public double toEat(int[] arr, int hourly) {

        double totalhrs = 0;

        for (int num : arr) {
            totalhrs += Math.ceil((double) num / hourly);
        }

        return totalhrs;
    }
}