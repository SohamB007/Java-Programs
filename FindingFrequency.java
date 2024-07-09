import java.util.* ;
public class FindingFrequency {
    public static void FindFrequency(int[] arr){
        int visited = Integer.MIN_VALUE ;
        for(int i=0;i<arr.length;i++){
            int count = 1 ;
            if(arr[i]!=visited){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                    count++ ;
                    arr[j] = visited ;
                    }
                }
               System.out.println(arr[i]+" : "+ count); 
            }
        }   
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ;
    int[] arr = new int[n] ;
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt() ;
    }
    FindFrequency(arr) ;
    }
}
