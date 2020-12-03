package Ex1.points.XY;


public class Point extends Object {
	 private double x,y;
	 public Point() {
	        x = 0.0;
	        y = 0.0;
	    }

	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }
	    
	    public double distance(Point other) {
	        double dx = other.x - this.x;
	        double dy = other.y - this.y;
	        double distance = Math.sqrt(dx * dx + dy * dy);
	        return distance;
	    }

	    public String toString() {
	        return "(" +x + "," + y +")";
	    }
		 
		
}
