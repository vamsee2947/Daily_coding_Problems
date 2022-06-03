//You are given an array of non-negative integers that represents a two-dimensional 
//elevation map where each element is unit-width wall and the integer is the height.
//Suppose it will rain and all spots between two walls get filled up.


import java.util.*;

class Main {

	static int findWater(int arr[], int n)
	{
		int result = 0;

		int left_max = 0, right_max = 0;
		int L = 0, H = n - 1;

		while (L <= H) {
			if (arr[L] < arr[H]) {
				if (arr[L] > left_max)

					left_max = arr[L];
				else

					result += left_max - arr[L];
				L++;
			}
			else {
				if (arr[H] > right_max)
					right_max = arr[H];

				else
					result += right_max - arr[H];
				H--;
			}
		}

		return result;
	}


	public static void main(String[] args)
	{
		int arr[] = { 3, 0, 1, 3, 0, 5 };
		int n = arr.length;

		System.out.println(findWater(arr, n));
	}
}
