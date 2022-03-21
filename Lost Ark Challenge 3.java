import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double even;
		double odd;
		String str = sc.nextLine();
		String[] s = str.split(", ");
		double[] l = new double[s.length];

		for (int i = 0; i < s.length; i++) {
			l[i] = Double.parseDouble(s[i]);
		}

		even = evenSum(l);
		System.out.println(even);
		odd = oddSum(l);
		System.out.println(odd);
	}

	public static double evenSum(double[] a) {

		double sum = 0;
		for (int i = 0; i < a.length; i += 2) {
			sum += a[i];
		}

		return sum;
	}

	public static double oddSum(double[] a) {

		double sum = 0;
		for (int i = 1; i < a.length; i += 2) {
			sum += a[i];
		}

		return sum;
	}
}
