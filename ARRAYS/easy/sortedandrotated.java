package ARRAYS.easy;

public class sortedandrotated {
     public static void main(String[] args) {
                 int arr [] = {-1, 20,-3};
                 boolean bol= check(arr);

     }
     public static boolean check(int[] nums) {
          int count=0;
           for(int i=1;i<nums.length;i++){
               if(nums[i-1] > nums[i]){
                   count++;
               }
           }
           if(nums[nums.length-1] > nums[0])
           {
               count++;
           }
           return count<=1;
      }
}
