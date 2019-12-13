package by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic;

public class Rectangle {

	public static double findPerimeter(double x1, double y1, double x2, double y2) {
		return (Math.abs(x1) + Math.abs(x2)) * 2 + (Math.abs(y1) + Math.abs(y2)) * 2;
	}

	public static double findSquare(double x1, double y1, double x2, double y2) {
		return (Math.abs(x1) + Math.abs(x2)) * (Math.abs(y1) + Math.abs(y2));
	}
}
