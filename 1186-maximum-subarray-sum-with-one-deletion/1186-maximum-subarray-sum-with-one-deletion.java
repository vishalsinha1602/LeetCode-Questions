class Solution {
    public int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int oneDelete = 0;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int v1 = arr[i];
            int v2 = noDelete + arr[i];
            int v3 = oneDelete + arr[i];
            int v4 = noDelete;

            noDelete = Math.max(v1, v2);

            oneDelete = Math.max(v3, v4);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        return ans;
    }
}