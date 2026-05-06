class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length-1;

        for(int i=left;i<right;i++) {
            int lh = heights[i];
            for(int j=right;j>left;j--) {
                int rh = heights[j];

                int low = Math.min(rh,lh);
                int result = (j-i) * low;
                max = Math.max(max, result);
            }
        }
        return max;
    }
}
