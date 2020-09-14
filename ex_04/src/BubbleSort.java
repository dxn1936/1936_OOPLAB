
public class BubbleSort {
public static Integer data[];
	
	public BubbleSort() {
		data = null;
	
	}
	
	
	public static void sort(Integer data[]) {
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
	
	public static void print(Integer data[]) {
		
        for(int i=0; i < data.length; i++){  
				System.out.print( " | "+data[i]);
                } 
	     
      }	
}
