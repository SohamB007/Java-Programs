
import java.util.Arrays;

public class RemovingDuplicateSortedArrayElements {
    public static int[] removeDuplicates(int[] arr){
        int [] newArray = new int[arr.length] ; 
        newArray[0] = arr[0]; //
        int k = 0 ;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > newArray[k]){
                newArray[++k] = arr[i]; 
            }
        }
        newArray = Arrays.copyOf(newArray, k+1) ;
        return newArray ;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3} ;
        int[] a = removeDuplicates(arr) ;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",") ;
        }

    }
}
