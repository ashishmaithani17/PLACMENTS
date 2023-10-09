package ARRAYS.easy;

public class checksorted {
     public static void main(String[] args) {
          int a[] = {1, 2, 3, 4, 5};
          int n = a.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j < n; j++) {
        //            if( a[j]<a[i] )
        //                return 0;               
        //     }
        // }
        // return 1;

        for(int i=0;i<n-1;i++){  
          if(a[i]>a[i+1]){    
              System.out.println("0");;  
              }
      }
        System.out.println("1");
     }
}
