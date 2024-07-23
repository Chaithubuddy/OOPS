package Inheritance;

public class user {  // multi level class  -ex 2g,3g
	
	public static void main(String[] args) {
		
		Guest g = new Guest();
		g.read();

		Developer dev = new Developer();
		dev.read();
		dev.write();

		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();

	}

}
