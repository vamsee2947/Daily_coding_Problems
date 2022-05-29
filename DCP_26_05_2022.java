/*Given an array of numbers, find the maximum sum of any contiguous subarray of the array.*/


import java.io.*;
import java.util.*;
 
public class Main
{
    public static void main (String[] args)
    {
        int [] a = {34, -50, 42, 14, -5, 86]};
        System.out.println("Maximum contiguous sum is " + maxsum(a));
    }
 
    static int maxsum(int a[])
    {
        int size = a.length;
        int max = Integer.MIN_VALUE;
        int max_end = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_end = max_end + a[i];
            if (max < max_end)
                max = max_end;
            if (max_end < 0)
                max_end = 0;
        }
        return max;
    }
}
