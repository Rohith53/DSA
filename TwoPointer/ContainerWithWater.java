class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int res = -1;
        while(left < right){
            int w = right-left;
            int h =  Math.min(height[left],height[right]);
            res = Math.max(res, w*h);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}