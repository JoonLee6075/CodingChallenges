import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] key = new int[] {323,331,323,336,319,330,322};
		char[] convertedKey = new char[key.length];

		String str = "treasurelieswithinthischest";
		int sum = 0;
		
		char[] ch = new char[str.length()];
		
		
		  for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        }
		  
		  for(int i = 0; i < ch.length; i++) {
			  int ascii;
			  ascii = (int) ch[i] - 97;
			  sum += ascii;
			  
		  }
	  
		  for(int i = 0; i < key.length; i++) {
			  int answer;
			  answer = key[i] - sum;
			  convertedKey[i] = (char) (answer + 97);
			  
		  }
		  for(int i = 0; i < key.length; i++) {
			  System.out.print(convertedKey[i]);
		  }
		
		
	}
}
