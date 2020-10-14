package mobilestore;

public abstract class FeaturePhone extends MobilePhone{

	private Boolean isCamera;
	
	public FeaturePhone()
	{
		super();
		this.setIsCamera(false);
	}
	
	
	
	public FeaturePhone(Integer displaySize, String vendor, Integer batteryAmps,boolean isCamera)
	{
		super(displaySize,vendor,batteryAmps);
		this.setIsCamera(false);
	}

	/*	
	public void sleepTimer()
	{
		System.out.println("..."+this.getVendor()+" Mobile display goes to sleep in 15 secs ");
	}
*/	
	public Boolean getIsCamera() {
		return isCamera;
	}

	public void setIsCamera(Boolean isCamera) {
		this.isCamera = isCamera;
	}
	
}
