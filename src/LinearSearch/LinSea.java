package LinearSearch;

public class LinSea {

   

    int linearSearch(int[] arr, int search) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == search) {
                return i;
            }
        }
        return -1;
    }



public static void main(String[] args) {
    int[] nums = {23, 1, 34, 35, 46, 57};
    int search = 35;

   
    LinSea lSObject = new LinSea();

    
    int answer = lSObject.linearSearch(nums, search);
    System.out.println(answer);
     
      }
   }
