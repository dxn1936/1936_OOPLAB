
public class BubbleSort {
public Integer data[];
	
	public BubbleSort() {
		data = null;
	
	}
	
	public void setDataArray(Integer data[]) {
		this.data = data;
	}
	
	public void sort() {
	       int n = data.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(data[j-1] > data[j]){  
	                                 //swap elements  
	                                 temp = data[j-1];  
	                                 data[j-1] = data[j];  
	                                 data[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	}
	
	public void print() {
		
        for(int i=0; i < data.length; i++){  
				System.out.print( " | "+data[i]);
                } 
	     
      }	
}
