package biology;

public class LandAnimal extends Animal {
	private Integer topSpeed;
	
	public LandAnimal() {
		super();
		topSpeed=0;
	}

	public LandAnimal(Integer noOfLegs, Boolean isMale,Boolean isherbivorous,Integer topSpeed) {
		super(noOfLegs,isMale,isherbivorous);
		this.topSpeed = topSpeed;
	}

	@Override
	public void moving()
	{
		System.out.println("...is Moving on Land...");
	}
	
	public void moving(Integer speed)//overloading
	{
		System.out.println("...is Moving on Land at "+speed+"km/hr");
	}
	
	
	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
}
