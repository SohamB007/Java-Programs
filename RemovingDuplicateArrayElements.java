public class RemovingDuplicateArrayElements {
    public static int[] removeDuplicates(int[] arr){
        int k = 1 ;
        int[] newArray = new int[arr.length] ;
        newArray[0] = arr[0] ;

        for(int i = 1; i<arr.length ; i++){
            int j = 0 ;
            for( ; j<k ; j++){
                if(arr[i] == newArray[j]){
                    break ;
                }
            }
            if( j == k){
                newArray[k] = arr[i] ;
                k++ ;
            }
        }
        
        int[] b = new int[k];
        for(int i = 0; i<b.length; i++){
            b[i] = newArray[i] ;
        }
        return b; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 2} ;
        int[] res = removeDuplicates(arr) ;
        for(int i = 0; i< res.length; i++){
            System.out.print(res[i]+", ");
        }
    }  
}
