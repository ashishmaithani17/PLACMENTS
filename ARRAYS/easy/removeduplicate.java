package ARRAYS.easy;

public class removeduplicate {
     public static void main(String[] args) {
          int[] arr = {1, 2, 4, 6, 7, 5};
	     // int n = arr.length;
          
          // HashSet <Integer> set= new HashSet<>();
		// for (int i = 0; i < arr.length; i++) {
		// 	set.add(arr[i]);
		// }
		
        // return set.size();

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
     System.out.println(i+1);
     }
}
