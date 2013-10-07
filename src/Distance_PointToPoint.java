
public class Distance_PointToPoint {

	/**
	 * Write a program that reads the X and Y coordinates of three points and then outputs 
	 * which of the three are closer. 
	 * Use the following class to store the data for the points:
	 * class Point { double x; double y; }
	 * @param args
	 */
	public static void main(String[] args) {
		Point first = new Point();
		first.x = 4.4;
		first.y = 0.2;
		
		Point second = new Point();
		second.x = 6.2;
		second.y = 8.1;
		
		Point third = new Point();
		third.x = 1.6;
		third.y = 4.9;
		
		// find the distance between the three points
		double firstDistance = distance(first.x, first.y, second.x, second.y );
		double secondDistance = distance(second.x, second.y, third.x, third.y);
		double thirdDistance = distance(first.x, first.y, third.x, third.y);
		
//		System.out.println(firstDistance);
//		System.out.println(secondDistance);
//		System.out.println(thirdDistance);
		
		if (firstDistance < secondDistance && firstDistance < thirdDistance) {
			System.out.println("Points one and two are closer.");
		}
		else if (secondDistance < firstDistance && secondDistance < thirdDistance) {
			System.out.println("Points two and three are closer.");
		}
		else if (thirdDistance < secondDistance && thirdDistance < firstDistance) {
			System.out.println("Points one and three are closer.");
		} else {
			System.out.println("There are idendical distances");
		}
					

	}
	public static double distance(double a, double b, double x, double y) {
		double distance = 0.0;
		// Pythagorean Theorem c2 = a2 + b2
		double oneSide = a - x;
		double secondSide = b - y;
		distance = Math.sqrt((Math.pow(oneSide, 2) + Math.pow(secondSide, 2)));
		return distance;
	}

}

class Point {
	double x;
	double y;
}
