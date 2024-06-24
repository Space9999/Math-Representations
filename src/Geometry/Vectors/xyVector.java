public class xyVector extends dVector {
	private double x; // Component Form
	private double y; // Component Form
	// x and y must be negative if they are representing left or down respectively
	public xyVector(double x, double y) {
		super((float)Math.sqrt(x * x + y * y), Math.toDegrees(Math.atan2(y, x)));
		this.x = x; this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
		super.setDist((float)Math.sqrt(x * x + y * y));
		super.setDir(Math.toDegrees(Math.atan2(y, x)));
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
		super.setDist((float)Math.sqrt(x * x + y * y));
		super.setDir(Math.toDegrees(Math.atan2(y, x)));
	}
	
	public double[] getXY() {
		double[] coords = {x, y};
		return coords;
	}
	
	public void setXY(double x, double y) {
		this.x = x; this.y = y;
		super.setDist((float)Math.sqrt(x * x + y * y));
		super.setDir(Math.toDegrees(Math.atan2(y, x)));
	}
	
	public xyVector vectorAdd(xyVector other) {
		return new xyVector(x + other.getX(), y + other.getY());
	}
	
	public xyVector vectorSubtract(xyVector other) {
		return new xyVector(x  - other.getX(), y - other.getY());
	}
	
	public xyVector vectorMultiply(double factor) {
		return new xyVector(x * factor, y * factor);
	}
	
	public double dotProduct(xyVector other) {
		return (other.getX() * x) + (other.getY() * y);
	}
	
	public double angleBetween(xyVector other) {
		return dotProduct(other) / (super.getDist() * other.getDist());
	}
}