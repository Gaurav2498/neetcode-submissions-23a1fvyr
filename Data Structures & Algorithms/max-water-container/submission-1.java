class Solution {
    public int maxArea(int[] heights) {
       int i = 0;
       int j = heights.length-1;

       int maxArea = 0;

       while(i<j)
       {
        int height = Math.min(heights[i],heights[j]);
        int width = j - i;

        int currentArea = height * width;

        if(currentArea > maxArea)
        maxArea = currentArea;

        if(heights[i]<heights[j])
        i++;
        else
        j--;
       } 

       return maxArea;
    }
}
