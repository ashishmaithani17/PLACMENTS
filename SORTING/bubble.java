package SORTING;

import java.util.Scanner;

public class bubble{
     public static void main(String[] args) {
          int[] arr={9,46,24,52,20};
          int n= arr.length;
          bubblesort(arr,n);
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
        }

   

      static void bubblesort(int arr[], int n){
          for(int i=n-1;i>0;i--){
               int didswap=0;
             for(int j=0;j<i-1;j++){
                    if(arr[j]>arr[j+1]){
                          int temp= arr[j+1];
                          arr[j+1]= arr[j];
                          arr[j]=temp;
                          didswap=1;
                    }
               }
               if (didswap==0) {
                    break;
               }
          }
     }


}



