package app;


public class Person {
	
	private String name;
	private String dateOfBirth;
	private String stateBorn;
	private int heightInches;
	private int weightPounds;
	
	public Person(String name, String dateOfBirth, String stateBorn, int heightInches, int weightPounds) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.stateBorn = stateBorn;
		this.heightInches = heightInches;
		this.weightPounds = weightPounds;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getStateBorn() {
		return stateBorn;
	}


	public void setStateBorn(String stateBorn) {
		this.stateBorn = stateBorn;
	}


	public int getHeightInches() {
		return heightInches;
	}


	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}


	public int getWeightPounds() {
		return weightPounds;
	}


	public void setWeightPounds(int weightPounds) {
		this.weightPounds = weightPounds;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Rolando", "01041992", "Virgina", 68, 180);
		System.out.println("My name is " + person1.getName());
		person1.run();
		person1.eat();
		person1.sleep();
		person1.scrollSocialMedia();
		
		//The output was displayed for a few reasons. First, the person class was created and the attributes were initialized privately.
		//Secondly, the methods were given a run statement to print when they were called. Third, all the methods were combined in the main method.
		//The main method opened every one of the method calls and printed the contents.
	}
	
	public void run() {
		System.out.println("I like to run");
	}
	
	public void eat() {
		System.out.println("Eating is fun");
	}
	
	public void sleep() {
		System.out.println("Sleeping is my favorite pass time");
	}
	
	public void drive() {
		System.out.println("Driving is boring");
	}
	
	public void scrollSocialMedia() {
		System.out.println("I do not like to scroll social media");
	}

}
