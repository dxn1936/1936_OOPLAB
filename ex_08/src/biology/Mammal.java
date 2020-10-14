package biology;

	public abstract class Mammal {
	private Integer noOfLegs;
	private Boolean isMale;
	
	
	
	public Mammal() {
		
		noOfLegs = 0;
		isMale = false;
	}



	public Mammal(Integer noOfLegs, Boolean isMale) {
		
		this.noOfLegs = noOfLegs;
		this.isMale = isMale;
	}


	public abstract void canEat();
	
		
	public Integer getNoOfLegs() {
		return noOfLegs;
	}



	public void setNoOfLegs(Integer noOfLegs) {
		this.noOfLegs = noOfLegs;
	}



	public Boolean getIsMale() {
		return isMale;
	}



	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}
}
