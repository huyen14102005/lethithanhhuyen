package bai65;

public class Circle implements GeometricObject {
	protected double radius;
	
	
	 public Circle(double radius) {
	        this.radius = radius;
	    }
	
	@Override
	public double getPrameter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	
}
