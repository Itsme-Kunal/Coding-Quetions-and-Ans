
public class ArraySearch {
    public static void main(String[] args) {
        
        int []arr= {1,2,3,4,5,34,56,23,78,54,89};
        int target =56;

        System.out.println(LinearSearch(arr, target)); //  give input to the function & print the output return by the function 

    }

    static int LinearSearch(int []arr, int target){  
        if (arr.length == 0){   // Checks Wheteher Array is Emty or Not
            return -1;
        }

        for(int index =0; index<arr.length; index++){ // Iterate over the array elements
            int element = arr[index];
            if (element == target){  //Checks the whether the traget is equal to element.
                return index;      
            }
        }
        return -1;
    }
    
}
