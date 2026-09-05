class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

       for (int i = 0; i < intervals.length; i++) {

            int currStart=intervals[i][0];
            int currEnd = intervals[i][1];

            if (currEnd < start) {

                result.add(new int[]{currStart, currEnd});
            }

            else if (currStart > end) {

                result.add(new int[]{start, end});

                for (int j = i; j < intervals.length; j++) {
                    result.add(intervals[j]);
                }

                return result.toArray(new int[result.size()][]);
            }

            else {

                start = Math.min(start, currStart);
                end = Math.max(end, currEnd);
            }
        }

      
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);

    }
}