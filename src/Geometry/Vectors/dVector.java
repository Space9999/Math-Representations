public class dVector {
	private float dist;
	private double dir; 
	
	public dVector(float dist, double dir) {
		this.dist = dist;
		if (dir < 0) {this.dir = dir + 360;}
		else {this.dir = dir % 360;}
	}
	
	public dVector(double dir) {
		dist = 0;
		if (dir < 0) {this.dir = dir + 360;}
		else {this.dir = dir % 360;}
	}
	
	public dVector(float dist) {
		this.dist = dist;
		dir = 0;
	}
	
	public dVector() {
		dist = 0; dir = 0;
	}
	
	public float getDist() {
		return dist;
	}
	
	public void setDist(float dist) {
		this.dist = dist;
	}
	
	public double getDir() {
		return dir;
	}
	
	public void setDir(double dir) {
		this.dir = dir;
	}
}
