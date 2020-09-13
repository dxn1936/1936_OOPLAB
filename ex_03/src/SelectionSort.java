
public class SelectionSort {
public Integer data[];
	
	public SelectionSort() {
		data = null;
	
	}
	
	public void setDataArray(Integer data[]) {
		this.data = data;
	}
	
	public void sort() {
        	for (int i = 0; i < data.length - 1; i++)  
        	{  
        		int index = i;  
        		for (int j = i + 1; j < data.length; j++){  
        			if (data[j] < data[index]){  
        				index = j;//searching for lowest index  
        			}  
        		}  
        		int temp = data[index];   
        		data[index] = data[i];  
        		data[i] = temp;  
        	}  
    } 
	
	public void print() {
        int n = data.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(" | "+data[i]);
        
       } 
}
