/*Given a array of numbers representing the stock prices of a company in chronological order, 
write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.
For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.*/



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
