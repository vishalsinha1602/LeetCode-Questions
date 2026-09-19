class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;

        for(int num : weights) {
            low = Math.max(low, num);
        }

        int high = 0;

        for(int num : weights) {
            high += num;
        }

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int noOfDays = calculateDays(weights, mid);

            if(noOfDays <= days) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int calculateDays(int[] weights, int capacity) {

        int day = 1;
        int load = 0;

        for(int weight : weights) {

            if(load + weight <= capacity) {
                load += weight;
            }
            else {
                day++;
                load = weight;
            }
        }

        return day;
    }
}