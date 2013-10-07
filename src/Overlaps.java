import java.awt.Point;


public class Overlaps {

	/**
	 * Write a program that reads the coordinates of four point points, the former two defining one 
	 * rectangle and the latter two defining another one. 
	 * The program must read the coordinates of a fifth point and say whether the point is 
	 * inside both rectangles, inside one of them only, or out of both.
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle_creator rectangleA = new Rectangle_creator();		
		Rectangle_creator rectangleB = new Rectangle_creator();	
		
		// testing with hard coded values
		rectangleA.downRight = new Point(3,0);
		rectangleA.upLeft = new Point(0,4);
		rectangleB.downRight = new Point(2,1);
		rectangleB.upLeft = new Point(1,6);
		
		Point user_point = new Point(2,5);
		
		boolean a = Inside_Rectangle(user_point, rectangleA.upLeft,rectangleA.downRight);
		boolean b = Inside_Rectangle(user_point, rectangleB.upLeft,rectangleB.downRight);
		
		if (a && !b) {
			System.out.println("User point falls inside rectangle A");
		} 
		if (b && !a) {
			System.out.println("User point falls inside rectangle B");
		}		
		
		if (a && b) {
			System.out.println("User point falls inside Both rectangles");

		} 
		if (!a && !b ){
			System.out.println("User point falls inside none of the rectangles");

		}

	}
	
	public static boolean Inside_Rectangle(Point user_point, Point rectangle_upper_left, Point rectangle_lower_right) {
		boolean inside = false;
		if (user_point.x >= rectangle_upper_left.x && user_point.x <= rectangle_lower_right.x) {
			if (user_point.y >= rectangle_lower_right.y && user_point.y <= rectangle_upper_left.y) {
				inside = true;
			}	
		}
		return inside;
	}

}
class Rectangle_creator {
	 Point upLeft; 
	 Point downRight;
}
