import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int largest;
		int smallest;
		int duplicatePos;
		int duplicateLastPos;
		String str = sc.nextLine();
        String[] s = str.split(", ");
        int [] n = new int[s.length];
        
        for(int i=0; i < s.length; i++ ) {
        	n[i] =Integer.parseInt(s[i]);
        }
        
        
      largest =  largest(n);
      System.out.println(largest);
      smallest =  smallest(n);
      System.out.println(smallest);
		
      
    duplicatePos = firstPosition(n , largest);
     System.out.println(duplicatePos);
    duplicateLastPos = lastPosition(n,smallest);
     System.out.println(duplicateLastPos);

	}
	
	
	public static int largest(int[] a)
    {
        int i;
        int repeat = 0;
        // Initialize maximum element
        int max = a[0];
       
        // Traverse array elements from second and
        // compare every element with current max  
        for (i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
           	
        }
       for( i = 0; i < a.length; i++) {
    	   if(a[i] == max) {
    		   repeat++;
    	   }
       }
       System.out.println("max repeated " + repeat);
        return max;
    }
	public static int smallest(int[] a)
    {
        int i;
        int repeat = 0;
          
        // Initialize maximum element
        int min = a[0];
       
        // Traverse array elements from second and
        // compare every element with current max  
        for (i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
          
        }
        for( i = 0; i < a.length; i++) {
     	   if(a[i] == min) {
     		   repeat++;
     	   }
        }
      System.out.println("min repeated " + repeat);
        return min;
    }
	public static int firstPosition(int[] a , int b) {
		int pos = 0;
		int target = b;
		int length = a.length;
		
		for(int i = 0; i < length; i++) {
			
			if(a[i] == target) {
				pos = i;
				break;
			}
		}
		
		
		
		return pos;
	}
	public static int lastPosition(int[] a , int b) {
		int pos = 0;
		int target = b;
		int length = a.length;
		
		for(int i = length -1; i > 0; i--) {
			
			if(a[i] == target) {
				pos = i;
				break;
			}
		}
		
		
		
		return pos;
	}
}
	
	