package biology;

	public class Animal extends Mammal {
	private Boolean isherbivorous;
	
	
	public Animal() {
		super();
		isherbivorous=false;
		
	}

	public Animal(Integer noOfLegs, Boolean isMale,Boolean isherbivorous) {
		super(noOfLegs,isMale);
		this.isherbivorous= isherbivorous;
		
	}

	public void canEat()		//implementation of abstract method
	{
		System.out.println("...eats with mouth..");
	}
	
	public void moving()
	{
		System.out.println("...is Moving...");
	}
	
	

	public Boolean getIsherbivorous() {
		return isherbivorous;
	}

	public void setIsherbivorous(Boolean isherbivorous) {
		this.isherbivorous = isherbivorous;
	}

}
