package SORTING;

import java.util.Scanner;

class slsort{
     public static void main(String[] args) {
          int[] arr={9,46,24,52,20};
          int n= arr.length;
          selectionsort(arr,n);
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
        }

     static void selectionsort(int arr[], int n){
          for(int i=0;i<n-1;i++){
               int min=i;
               for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[min]){
                         min=j;
                    }
               }
               int temp= arr[min];
               arr[min]= arr[i];
               arr[i]=temp;
          }
     }

}