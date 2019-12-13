package by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.controler;

import by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic.Circle;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic.Point;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic.Rectangle;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.logic.Triangle;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.util.Scaner;
import by.bntu.fitr.poisit.zavadskaya.javalabs.lab08.view.Printer;

public class Main {

	public static void main(String[] args) {
		Printer.toPrint("Hypotenuse = " + Triangle.findHypotenuse(Scaner.toScan("Input a: "), Scaner.toScan("Input b: ")));
		Printer.toPrint("Perimeter = " + Triangle.findPerimeter(Scaner.toScan("\nInput a: "), Scaner.toScan("Input b: ")));
		Printer.toPrint("Square = " + Triangle.findSquare(Scaner.toScan("\nInput a: "), Scaner.toScan("Input b: ")));

		Printer.toPrint("The square of the ring = " +
		Circle.findSquareOfRing(Scaner.toScan("\nInput R1: "), Scaner.toScan("Input R2: ")));

		Printer.toPrint(
				"Distance between two points = " + Point.findDistanceBetweenTwoPoints(Scaner.toScan("\nInput x1: "),
						Scaner.toScan("Input y1: "), Scaner.toScan("Input x2: "), Scaner.toScan("Input y2: ")));
		Printer.toPrint("Perimeter of rectangle = " + Rectangle.findPerimeter(Scaner.toScan("\nInput x1: "),
						Scaner.toScan("Input y1: "), Scaner.toScan("Input x2: "), Scaner.toScan("Input y2: ")));
		Printer.toPrint("Square of rectangle = " + Rectangle.findSquare(Scaner.toScan("\nInput x1: "),
				Scaner.toScan("Input y1: "), Scaner.toScan("Input x2: "), Scaner.toScan("Input y2: ")));
		
		
		
	}

}
