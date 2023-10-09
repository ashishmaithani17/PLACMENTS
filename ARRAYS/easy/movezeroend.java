package ARRAYS.easy;

public class movezeroend {
     public static void main(String[] args) {
          
     }
     public static int[] moveZeros(int n, int []a) {
           int j = 0;
  
          int count = 0;
          for(int i = 0;i<n;i++){
              if(a[i] !=0){
                  a[j++] = a[i];
              }else{
                  count++;
              }
          }
          for(int i = 0;i<count;i++){
              a[j++] = 0;
              
          }
          return a;
      }
}
