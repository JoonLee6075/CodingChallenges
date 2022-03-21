import java.util.Scanner;


public class Main {
	// Main Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int counter = 0;
		float average;
		String str = sc.nextLine();
        String[] s = str.split(",");
        
        for(int i=0; i < s.length; i++ ) {
        	sum += Integer.parseInt(s[i]);
        }
        counter = s.length;
   average = sum / counter;
		System.out.println(sum);
		System.out.println(average);
        
		

	}
}
