package Abstraction;

public class customer {
	public static void main(String[] args) {
	
		
		loan b = new hdfc();
		double hdfc=b.rofint (10000);
		System.out.println(hdfc);
		
		double sbi;
		b = new sbi();
		sbi =b.rofint(10000);
		System.out.println(sbi);

		double icici;
		b = new icici();
		icici =b.rofint(10000);
		System.out.println(icici);

	}

}
