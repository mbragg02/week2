import java.awt.Point;


public class Rectangle {

	/**
	 * Write a program that reads the X and Y coordinates of two points and then outputs the area 
	 * of a rectangle where both points are opposite corners. 
	 * Use the following class to store the data for the points:
	 * class Rectangle { Point upLeft; Point downRight; }
	 * Your program should calculate (and write on the screen) the perimeter and area of the rectangle.
	 * @param args
	 */

	public static void main(String[] args) {
		Rectangle_Data point_data = new Rectangle_Data();
		
		point_data.downRight = new Point(3,0);
		point_data.upLeft = new Point(0,4);
				
		int height = Math.abs(point_data.upLeft.y - point_data.downRight.y);
		int width = Math.abs(point_data.upLeft.x - point_data.downRight.x);
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);


		int area = height * width;
		System.out.println("Area: " + area);
		
		int perimeter = (height * 2) + (width * 2);
		System.out.println("Perimeter: " + perimeter);
		
				

	}

}
class Rectangle_Data {
	 Point upLeft; 
	 Point downRight;
}
