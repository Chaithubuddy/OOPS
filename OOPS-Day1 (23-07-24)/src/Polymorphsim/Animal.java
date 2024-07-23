package Polymorphsim;

public class Animal {
	
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Cat meows");
	    }
	
	    
		
		/*
		 * Code Reusability: Methods can be reused by different types of objects.
		 * Flexibility: New functionality can be added without changing existing code.
		 * Maintainability: Easier to manage and modify code.
		 */

	    public static void main(String[] args) {
	        Animal myAnimal = new Animal(); 
	        Animal myDog = new Dog(); 
	        Animal myCat = new Cat();

	        myAnimal.sound(); 
	        myDog.sound();
	        myCat.sound();
	    }

	


}
