/*Given a array of numbers representing the stock prices of a company in chronological order, 
write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.
For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.*/



public class maxprofit{
    public static int maxprofit(int arr[]){
        
        int buy = arr[0];
        int profit = 0;
         
         for (int i=1;i<arr.length;i++) {
             if(buy > arr[i])
                  buy= arr[i];
             if(profit < arr[i]-buy)
                 profit= arr[i] -buy;
    }
    
         return profit;
    }
     public static void main(String []args){
         int []arr = {9, 11, 8, 5, 7, 10};
         int ans=maxprofit(arr);
         System.out.println(ans);
     }
}
