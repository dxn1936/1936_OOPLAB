package biology;

public class WaterAnimal extends Animal{
	private Integer topSpeed;
	
	public WaterAnimal() {
		super();
		topSpeed=0;
	}

	public WaterAnimal(Integer noOfLegs, Boolean isMale,Boolean isherbivorous,Integer topSpeed) {
		super(noOfLegs,isMale,isherbivorous);
		this.topSpeed = topSpeed;
	}
	
	@Override
	public void moving()
	{
		System.out.println("...is Moving in the ocean...");
	}
	
	public void moving(Integer speed)//overloading
	{
		System.out.println("...is Moving in the ocean at "+speed+"km/hr");
	}
	
	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
}
