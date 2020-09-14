
public class Mainclass {
	public static void main(String[] args) { 
		Integer arr[] = {43, 132, 9, 342, 11, 112};
		Integer arr1[] = {43, 132, 9, 342, 11, 112};
		Integer arr2[] = {43, 132, 9, 342, 11, 112};
		
		
	
		System.out.println("BUBBLE SORT :"); 
		System.out.println("Array Before Bubble Sort"); 
		BubbleSort.print(arr);
		System.out.println("\n\nArray After Bubble Sort"); 
		BubbleSort.sort(arr);
		BubbleSort.print(arr);
		
		/***************************************************/
			
		System.out.println("\n\n*******************");
		System.out.println("\nINSERTION SORT :");  
		System.out.println("Array Before Inserton Sort"); 
		InsertionSort.print(arr1);
		System.out.println("\n\nArray After Insertion Sort"); 
		InsertionSort.sort(arr1);
		InsertionSort.print(arr1);
		
		/***************************************************/
		
		
		System.out.println("\n\n*******************");
		System.out.println("\nSELECTION SORT :");  
		System.out.println("Array Before Selection Sort"); 
		SelectionSort.print(arr2);
		System.out.println("\n\nArray After Selection Sort"); 
		SelectionSort.sort(arr2);
		SelectionSort.print(arr2);


	}
}
