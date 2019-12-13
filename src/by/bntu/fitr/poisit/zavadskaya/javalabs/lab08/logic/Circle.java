package by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic;

public class Circle {

	public static double findSquareOfRing(double r1, double r2) {
		if (r2 > r1) {
			return -1;
		}
		return (Math.PI * r1 * r1) - (Math.PI * r2 * r2);
	}
}
