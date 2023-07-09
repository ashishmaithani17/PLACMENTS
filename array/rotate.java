class rotate{
     public static void main(String[] args) {
          int[] arr={78,34,21,56,93,40};
          rotate obj = new rotate();
          System.out.println("Original Array:");
          System.out.println(arr);
          //rotate array by any number
          obj.rotateArray(arr,1);
     }
     public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
  void  reverseArray(int[] nums,int start, int end){
        for(int i=start, j=end;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}