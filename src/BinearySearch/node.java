package BinearySearch;


 
  class BinarySearch {

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
	

      public static void main(String[] args) {
           int[] arr = {-1, -34, -35, 23, 45, 57, 89, 23, 1, 32, 47, 34};
           int target = 57;

    
           BinarySearch binarySearch = new BinarySearch();

          int ans = binarySearch.binarySearch(arr, target);
          System.out.println(ans);
    
    
         }
      
        
      
  }

