import java.util.*;
 /**
  * Program1
  */
 class FindLargestaArrayElement {

    public static int Largest(int[] arr){
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
         if(arr[i] > large){
            large = arr[i] ;
            }   
        }
        return large ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int[] arr = new int[size] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() ;
        }
        System.out.println(Largest(arr));
        
        sc.close() ;
    }
 }