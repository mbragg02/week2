import java.awt.Point;


public class InsideOrOutside {

	/**
	 * Write a program that reads the coordinates of the two points defining a rectangle 
	 * and then the coordinates of a third point. 
	 * The program must then determine whether the point falls inside or outside the rectangle.
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle_size point_data = new Rectangle_size();
		
		// user input
		
		
		
		// testing with hard coded values
		point_data.downRight = new Point(3,0);
		point_data.upLeft = new Point(0,4);
		Point user_point = new Point(1,1);
		
		// check if user_point falls inside the Rectangle_size
		boolean inside = false;
		if (user_point.x >= point_data.upLeft.x && user_point.x <= point_data.downRight.x) {
			if (user_point.y >= point_data.downRight.y && user_point.y <= point_data.upLeft.y) {
				inside = true;
			}
			
		}
		
		// Print out response
		if(inside) {
			System.out.println("Your point (" + user_point.x + "," + user_point.y + ") falls inside the rectangle.");
		} else {
			System.out.println("Your point (" + user_point.x + "," + user_point.y + ") does not fall inside the rectangle.");

		}
		

	}

}
class Rectangle_size {
	 Point upLeft; 
	 Point downRight;
}
