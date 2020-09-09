/*Name : Darshan Naik
 Rollno:1936
 Program:Java program for selection sort
 */
public class SelectionSort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
				int min_element = i;
				for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_element])
				min_element = j;
				int temp = arr[min_element];
				arr[min_element] = arr[i];
				arr[i] = temp;
		}
	}
	// Method to print the elements of an array
	void printarray(int arr[])
	{
			int n = arr.length;
			for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
			System.out.println();
	}

	public static void main(String args[])
	{
			SelectionSort ob = new SelectionSort();
			int arr[] = {15, 10, 99, 53, 36};
			System.out.println("Array Before Selection Sort");  
			for(int i=0; i < arr.length; i++){  
             System.out.print(arr[i] + " ");  
			}  
			System.out.println();  
			ob.sort(arr);
			System.out.println("Array after Selection Sort");
			ob.printarray(arr);
	}
}
