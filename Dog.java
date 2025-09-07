public class Dog{
	public Dog(String name){
		super(name);
	}
	public void greets(){
		System.out.println("Woof");
	}
	public void greets(String dog){
		this.dog=dog;
		System.out.prinln("Wooof");
	}
}