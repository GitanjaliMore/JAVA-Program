package conn;

public class Volume {
	
	public int cube;
	public double sphere;
	public double cubes;
	void volume(int area) {
		cube= area*area*area;
		System.out.println("volume of cube is="+cube);
	}
	void display(double r) {
		 sphere = (double)4/3*r*r*r;
		 System.out.println("volume of sphere is="+sphere);
		
	}
	void volume(double l,double h,double b) {
		cubes =l*b*h;
		System.out.println("volume of cubes is="+cubes);
	}
	public static void main(String[] args) {

		Volume volume = new Volume();
		volume.volume(6);
		volume.volume(4);
		volume.volume(2,3,6);
		
	}
		
		
	}

   