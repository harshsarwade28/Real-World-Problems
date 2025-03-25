package Day_02;

abstract class Animal{
	
	String name;
	Animal(String name){
		this.name=name;
	}
	
	abstract public void Sound();
} 

class Dog extends Animal{
	
	Dog(String name) {
		super(name);
		
	}

	public void Sound() {
		System.out.println(name+" Says: "+"Woof Woof!");
	}
}

class Cat extends Animal{
	
	Cat(String name) {
		super(name);
		
	}

	public void Sound() {
		System.out.println(name+" Says: Meow!");
	}
}
public class AnimalSoundImplementation {
	public static void main(String[] args) {
		
		Animal a = new Dog("KOKO");
		Animal a1 = new Cat("MINU");
		a.Sound();
		a1.Sound();
	}
}
