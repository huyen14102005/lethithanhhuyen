package bai65;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public double resize(int percent) {
		double factor = percent / 100.0;
		radius *= factor;
		return radius;
		
	}
	
	
	
}
