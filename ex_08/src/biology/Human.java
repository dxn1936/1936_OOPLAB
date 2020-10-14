package biology;

	public class Human extends Mammal{
	private Boolean isWrite;
	
	public Human()
	{
		super();
		isWrite=false;
	}

	public Human(Integer noOfLegs,Boolean isMale,Boolean isWrite) 
	{
		super(noOfLegs,isMale);
		this.isWrite = isWrite;
	}
	
	
	public void canEat()
	{
		//super.canEat();
		System.out.println("...eats with hands & mouth..");
	}
	
	public void canEat(Boolean nonVeg)						//overloading
	{
		System.out.println("eats.."+(nonVeg ? "non-veg" : "veg")+" with hands & mouth..");
	}
	
	public void canRead()
	{
		System.out.println("...human reading...");
	}
	
	public void canRead(String language)
	{
		System.out.println("...human reading "+language+"...");
	}

	public Boolean getIsWrite() {
		return isWrite;
	}

	public void setIsWrite(Boolean isWrite) {
		this.isWrite = isWrite;
	}
}
