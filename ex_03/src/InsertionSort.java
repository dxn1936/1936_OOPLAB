
public class InsertionSort {
public Integer data[];
	
	public InsertionSort() {
		data = null;
	
	}
	
	public void setDataArray(Integer data[]) {
		this.data = data;
	}
	
	public void sort() {
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
	
	public void print() {
		int n = data.length;
        for (int i = 0; i < n; ++i) 
            System.out.print( " | "+ data[i]); 
                }
}
