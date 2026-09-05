class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> newList = new ArrayList<>();
        boolean inserted = false;

        // Step 1: newInterval ko correct position par insert karo
        for (int i = 0; i < intervals.length; i++) {

            if (intervals[i][0] <= newInterval[0]) {

                // Current interval pehle hai
                newList.add(intervals[i]);

            } else {

                // Current interval newInterval ke baad hai
                if (inserted == false) {

                    newList.add(newInterval);
                    inserted = true;
                }

                newList.add(intervals[i]);
            }
        }

        // Agar abhi tak newInterval insert nahi hua
        if (inserted == false) {
            newList.add(newInterval);
        }

        // ArrayList<int[]> -> int[][]
        int[][] result = newList.toArray(new int[0][]);

        // Step 2: merge overlapping intervals
        return merge(result);
    }


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            // Overlap
            if (start2 <= end1) {

                end1 = Math.max(end1, end2);

            } else {

                // No overlap
                result.add(new int[]{start1, end1});

                start1 = start2;
                end1 = end2;
            }
        }

        // Last interval
        result.add(new int[]{start1, end1});

        return result.toArray(new int[result.size()][]);
    }
}