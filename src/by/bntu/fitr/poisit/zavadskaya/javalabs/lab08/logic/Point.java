package by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic;

public class Point {

	public static double findDistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((Math.abs(x1) + Math.abs(x2)) * (Math.abs(x1) + Math.abs(x2))
				+ ((Math.abs(y1) + Math.abs(y2)) * (Math.abs(y1) + Math.abs(y2)))));
	}
}
