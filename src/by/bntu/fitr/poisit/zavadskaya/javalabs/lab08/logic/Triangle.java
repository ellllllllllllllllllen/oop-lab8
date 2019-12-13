package by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic;

public class Triangle {

	public static boolean isTriangleCheck(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;
	}

	public static double findHypotenuse(double a, double b) {

		return isTriangleCheck(a, b, Math.sqrt(a * a + b * b)) ? Math.sqrt(a * a + b * b) : -1;
	}

	public static double findPerimeter(double a, double b) {
		if (isTriangleCheck(a, b, Math.sqrt(a * a + b * b))) {
			return a + b + Math.sqrt(a * a + b * b);
		}
		return -1;
	}

	public static double findSquare(double a, double b) {
		if (isTriangleCheck(a, b, Math.sqrt(a * a + b * b))) {
			return a * b / 2;
		}
		return -1;
	}

}
