package mobilestore;

public class SmartFeaturePhone extends FeaturePhone{
	public SmartFeaturePhone()
	{
		super();
	}
	
	public SmartFeaturePhone(Integer displaySize, String vendor, Integer batteryAmps,boolean isCamera)
	{
		super(displaySize,vendor,batteryAmps,isCamera);
		this.setIsCamera(false);
	}
	
	public void sleepTimer()
	{
		System.out.println("..."+this.getVendor()+" Mobile display goes to sleep in 10 secs ");
	}
	
}
