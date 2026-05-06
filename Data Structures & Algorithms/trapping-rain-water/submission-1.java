class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int sum = 0;

        int leftMax = 0;
        int rightMax = 0;
        
        while(left < right) {
            if(height[left] < height[right]) { // 왼쪽벽의 높이 만큼 물이 고여
                if(height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    sum += leftMax - height[left];
                }
                left++;
            } else {
                 if(height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    sum += rightMax - height[right];
                }
                right--;
            }
        }
        return sum;
    }
}
