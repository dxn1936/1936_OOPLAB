
public class InsertionSort {
public static Integer data[];
	
	public InsertionSort() {
		data = null;
	
	}
	
	
	public static void sort(Integer data[]) {
        int n = data.length;  
        for (int j = 1; j < n; j++) {  
            int key = data[j];  
            int i = j-1;  
            while ( (i > -1) && ( data [i] > key ) ) {  
                data [i+1] = data [i];  
                i--;  
            }  
            data[i+1] = key;  
        }  
    } 
	
	public static void print(Integer data[]) {
		int n = data.length;
        for (int i = 0; i < n; ++i) 
            System.out.print( " | "+ data[i]); 
                }
}
