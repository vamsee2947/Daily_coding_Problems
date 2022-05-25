public class maxprofit{
    public static int maxprofit(int arr[]){
        int sum=0;
         int n = arr.length;
         for(int i =0; i< n;i++){
             for(int j=i+1; j< n;j++){
                     if(arr[j]-arr[i] >0 && sum < arr[j]-arr[i]){
                        sum= arr[j]-arr[i];  
                     
                 }
             }
         }return sum;
    }
     public static void main(String []args){
         int []arr = {9, 11, 8, 5, 7, 10};
         int ans=maxprofit(arr);
         System.out.println(ans);
     }
}
