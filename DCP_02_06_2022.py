/*An sorted array of integers was rotated an unknown number of times.
Given such an array, find the index of the element in the array in faster than linear time. 
If the element doesn't exist in the array, return null.*/

class Main {
	static int Find(int arr[], int l, int h, int key)
	{
		if (l > h)
			return 0;

		int mid = (l + h) / 2;
		if (arr[mid] == key)
			return mid;

		if (arr[l] <= arr[mid]) {
			if (key >= arr[l] && key <= arr[mid])
				return Find(arr, l, mid - 1, key);
			return Find(arr, mid + 1, h, key);
		}

		if (key >= arr[mid] && key <= arr[h])
			return Find(arr, mid + 1, h, key);

		return Find(arr, l, mid - 1, key);
	}

	public static void main(String args[])
	{
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		int key = 1;
		int o = Find(arr, 0, n - 1, key);
		
		if (o != 0)
			System.out.println("Index: " + o);
		else
			System.out.println(o);
	}
}

