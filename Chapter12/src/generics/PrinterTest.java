package generics;

public class PrinterTest {
	public static void main(String[] args) {
		Printer<Plastic> printer1 = new Printer<>();
		Printer<Powder> printer2 = new Printer<>();
		
		printer1.setMaterial(new Plastic());
		printer2.setMaterial(new Powder());
		
		System.out.println(printer1.toString());
		System.out.println(printer2.toString());
		
		printer1.printing();
		printer2.printing();
		
	}
}
