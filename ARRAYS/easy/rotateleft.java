package ARRAYS.easy;

public class rotateleft {
    public static void main(String[] args) {
      int[] arr = {1, 2, 4, 6, 7, 5};
	int n = arr.length;
     int temp=arr[0];
     for(int i=1;i<n;i++){
          arr[i-1]=arr[i];
     }
     arr[n-1]=temp;
     for (int x:arr){
          System.out.print(" "+x);
          }
    }
}
