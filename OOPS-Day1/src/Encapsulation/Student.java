package Encapsulation;

//private makes outside class not accesible so
//	only set by setter and get only getters
//checks only whether its int or not //Gmail check




public class Student {
	
	
//	public  Integer Id;
//	public String name;  // trim
//	public Integer age;     
//	public Double marks;
	
	
	
	private   Integer Id;
	private String name;  // trim
	private Integer age;     
	private Double marks;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();      //trim     
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	
	
	
	
	

	

}
