package conn;


//1. Design a class to overload a function compute() as follows: 
//(i) void compute(int,char): to compute the square of the integer 
//argument if the given character argument is ‘s’ otherwise find its 
//cube. 
//(ii) void compute(double char): to compute volume of a cube 
//if the given character argument is ‘v’ otherwise find its diagonal. 
//
//(iii) void compute(int,int,char): to compute area of a rectangle if
//the given character argument is ‘a’ otherwise finds its perimeter. 
//Volume of cube=side3 Area of rectangle=length*breadth 
//Diagonal of cube=a√3 Perimeter of rectangle=2*(length+breadth)
public class Overload {
	public void compute(int num, char ch) {
		if(ch == 's') {
			
			System.out.println("Square of integer: "+num*num);
		}
		else {
			System.out.println("Cube of integer: "+num*num*num);
		}
		
	}
	public void compute(double num, char ch) {
		
		if(ch == 'v') {
			double volume = num*num;
			System.out.println("Volume of cube: "+volume);
		}
		else {
			double diagonal=(num*Math.sqrt(3));
			System.out.println("Diagonal of cube: "+diagonal);
		}
		
	}
	
	public int compute(int l, int b, char ch) {
		if(ch =='a') {
			int area = l*b;
			System.out.println("Area of Rectangle: " +area);
			return area;
			
			
		}
		else {
			int perimeter = 2*(l+b);
			System.out.println("Perimter of Rectangle: " +perimeter);
			return perimeter;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload overload = new Overload();
		overload.compute(6, 's');
		overload.compute(3.5, 'v');
	    //overload.compute(5, 6, 'a');
		overload.compute(5,6,'a');
		
	}

}