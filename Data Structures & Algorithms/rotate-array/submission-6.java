class Solution {
    public void rotate(int[] nums, int k) {
        int x = k%nums.length;

        reverse(0,nums.length-1,nums);
        reverse(0,x-1,nums);
        reverse(x,nums.length-1,nums);
    }

    public void reverse(int i,int j, int[] arr){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}