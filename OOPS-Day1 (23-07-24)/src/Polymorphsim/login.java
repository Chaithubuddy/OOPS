package Polymorphsim;



class Student{
	Integer rollNumber;
	
	String name;
	
	
	
}










public class login {
	public void submit(String u, String p) {
		System.out.println("u & p");
	}

	public void submit(String u, int otp) {
		System.out.println("u&otp");
	}

	public  void  submit(String u,String q1,String q2) {
		System.out.println("u &q1&q2");

	}

	public static void main(String[] args) {
		login l =new login();
		l.submit("chaithu",9573 );
		l.submit("chaithu", "lav");
		l.submit("chaithu", "lav", "prassu");

	}

}

