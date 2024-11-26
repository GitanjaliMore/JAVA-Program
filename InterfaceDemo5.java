package conn;
@FunctionalInterface
interface Printer{
	void printJob();
	//default method introduced Java 8 feature
	default void scan() {
		System.out.println("Scanning....");
	}
    //static method introduced Java 8 feature
	static void threeDPrintJob() {
		System.out.println("3D printing...");
	}
}
class EpsonPrinter implements Printer{
	
	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("Printing using EpsonPrinter");
		
	}
}
class CanonPrinter implements Printer{

	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("Printing using CanonPrinter");
		
	}
	
}
public class InterfaceDemo5 {
public static void main(String[] args) {
	Printer p = new CanonPrinter();
	p.printJob();
	p.scan();
	Printer.threeDPrintJob();
	
}
}
