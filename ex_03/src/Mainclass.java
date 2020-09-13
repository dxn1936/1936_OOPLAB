
public class Mainclass {
	public static void main(String[] args) { 
		Integer arr[] = {43, 132, 9, 342, 11, 112};
		Integer arr1[] = {43, 132, 9, 342, 11, 112};
		Integer arr2[] = {43, 132, 9, 342, 11, 112};
		
		BubbleSort bsort = new BubbleSort();
		
		bsort.setDataArray(arr);
	
		System.out.println("BUBBLE SORT :"); 
		System.out.println("Array Before Bubble Sort"); 
		bsort.print();
	    bsort.sort();
		System.out.println("\n\nArray After Bubble Sort"); 
		bsort.print();
		
		/***************************************************/
		
        InsertionSort insort = new InsertionSort();
		
		insort.setDataArray(arr1);
		
		System.out.println("\n\n*******************");
		System.out.println("\nINSERTION SORT :");  
		System.out.println("Array Before Inserton Sort"); 
		insort.print();
	    insort.sort();
		System.out.println("\n\nArray After Insertion Sort"); 
		insort.print();
		
		/***************************************************/
		
        SelectionSort selectsort = new SelectionSort();
		
		selectsort.setDataArray(arr2);
		
		System.out.println("\n\n*******************");
		System.out.println("\nSELECTION SORT :");  
		System.out.println("Array Before Selection Sort"); 
		selectsort.print();
	    selectsort.sort();
		System.out.println("\n\nArray After Selection Sort"); 
		selectsort.print();


	}
}
