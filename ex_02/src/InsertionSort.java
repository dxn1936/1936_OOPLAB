/*Name : Darshan Naik
 Rollno:1936
 Program:Java program for insertion sort
 */
public class InsertionSort {
	void sort(int arr[]) 
    { 
        	int n = arr.length; 
        	for (int i = 1; i < n; ++i) 
        	{ 
        		int key = arr[i]; 
        		int j = i - 1; 
        		while (j >= 0 && arr[j] > key) 
        		{ 
        			arr[j + 1] = arr[j]; 
        			j = j - 1; 
        	} 
        		arr[j + 1] = key; 
        } 
    } 
  
    /* A function to print array of size n*/
    public static void displayArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = { 25, 28, 18, 10, 5 }; 
        InsertionSort ob = new InsertionSort(); 
        System.out.println("Array Before Insertion Sort");  
		for(int i=0; i < arr.length; i++){  
         System.out.print(arr[i] + " ");  
		}
		System.out.println();
        ob.sort(arr); 
        System.out.println("Array after Insertion Sort");
        displayArray(arr); 
    } 
}
