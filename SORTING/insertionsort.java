package SORTING;
public class insertionsort {
     public static void main(String[] args) {
          int[] arr={9,46,24,52,20};
          int n= arr.length;
          insertion_sort(arr,n);
          for(int i=0;i<n;i++){
               System.out.print(arr[i]+" ");
          }
     }
     static void insertion_sort(int[] arr, int n){
                  for (int i=0;i<n;i++){
                    int j=i;
                    while (j>0 && arr[j-1]>arr[j]) {
                         int temp=arr[j-1];
                         arr[j-1]=arr[j];
                         arr[j]= temp;

                         j--;
                    }
                  }
     }
}
