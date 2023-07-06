import java.util.Arrays;

public class oneside {
     public static void main(String[] args) {
          int arr[]={-3,-2,-10,45,6,3,-9,65,-7};
          int left=0, right= arr.length-1;
          while (left<right){
             while(arr[left]<0) left++;
             while(arr[right]<0) right--;
               
               if(left>=right) break;

             int temp=arr[left];
             arr[left]=arr[right];
             arr[left]=temp;
     }
     System.out.println(Arrays.toString(arr));
   }
  }