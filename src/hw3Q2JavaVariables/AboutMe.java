package hw3Q2JavaVariables;
public class AboutMe {
	
	public static void main(String[] args) {
		AboutMe me = new AboutMe();
		me.age=12;
		System.out.println("Hello my name is "+ me.name+".");
		System.out.println("I am "+ me.age+" years old.");
		System.out.println("I am "+ (me.isEmployed ? "Employed": "Unemployed"));
		System.out.println("My credit card number is "+me.ccNumber);
	}
	
	AboutMe(){};
	
	
	//int char boolean string float double byte long 
	private int age; //declared, not initialized, -2.14b - 2.14b
	public String name= "Rina"; //initialized. 
	public char gender= 'F';
	public boolean isEmployed = true;
	public float gpa = 3.5f;
	public double shoeSize = 8.5;
	public byte waistSize = 24; // 0-32
	public long ccNumber = 420767017581384L;
	
	
	// private - access modifier
	// int - datatype
	// age - variable
	// 25 value 
	
	// void - no return statement
	// int - return int variable
	
}
