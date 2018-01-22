import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws ArithmeticException{
		Scanner in = new Scanner(System.in);
		String s, v1, v2, c;
		cheak();

	}

	private static void cheak() {
		int i = 0;
		while (i != 5) {

			String s1, s2;
			double v1, v2, r;

			s1 = in.next();
			char c = in.next().charAt(0);
			s2 = in.next();

			v1 = Double.valueOf(s1);
			v2 = Double.valueOf(s2);

			if (c == '+')
				addition(v1, v2);
			else if (c == '-')
				subtraction(v1, v2);
			else if (c == '*')
				multiplication(v1, v2);
			else if (c == '/')
				division(v1, v2);
			else if (c == '^')
				Pow(v1, v2);
			else if (c == '$')
				square(v1, v2);
			else if (c == '%')
				modulus(v1, v2);
			else if (c == '%')
				modulus(v1, v2);
			else if (c == '%')
				modulus(v1, v2);
		}

	}

	private static void square(double v1, double v2) {
		int a = 4, b = 4;

	}

	private static void factorials(double v1, double v2) {
		// TODO Auto-generated method stub

	}

	private static void modulus(double v1, double v2) {
		double r = v1 % v2;
		System.out.println("Result : " + r);

	}

	private static void Pow(double v1, double v2) {
		double r = pow(v1, v2);
		System.out.println("Result : " + r);

	}

	private static void division(double v1, double v2) {
		double r = v1 / v2;
		System.out.println("Result : " + r);
	}

	private static void multiplication(double v1, double v2) {
		double r = v1 * v2;
		System.out.println("Result : " + r);

	}

	private static void subtraction(double v1, double v2) {
		double r = v1 - v2;
		System.out.println("Result : " + r);

	}

	private static void addition(double v1, double v2) {
		double r = v1 + v2;
		System.out.println("Result : " + r);

	}

}