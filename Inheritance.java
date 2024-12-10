package day13;


class Animal{
	public void makeSound() {
	     System.out.println("This animal makes a Sound");
	     
}
	
}
class Dog extends Animal{
	@Override
	
	public void makeSound() {
	     System.out.println("The Dog Barks");
	     
}
	
}
class Cat extends Animal{
	@Override
	public void makeSound() {
	     System.out.println("The Cat Meows");
	     
}
	
}

public class Inheritance {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.makeSound();
		cat.makeSound();
	}

}
 