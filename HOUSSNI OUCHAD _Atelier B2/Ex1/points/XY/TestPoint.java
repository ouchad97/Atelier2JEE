package Ex1.points.XY;

public class TestPoint {
		 static public void main(String args[]){
		        Point p1 = new Point(0.0, 0.0);
		        Point p2 = new Point(3.0, 3.0);
		        System.out.println(p1.toString());
		        System.out.println(p2.toString());
		        System.out.println("La distance entre p1 to p2 is " + p1.distance(p2));
		 }
}