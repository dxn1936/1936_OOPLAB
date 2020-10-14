package mobilestore;

public class GreyscaleFeaturePhone extends FeaturePhone {
	public GreyscaleFeaturePhone()
	{
		super();
	}
	
	public GreyscaleFeaturePhone(Integer displaySize, String vendor, Integer batteryAmps,boolean isCamera)
	{
		super(displaySize,vendor,batteryAmps,isCamera);
		this.setIsCamera(false);
	}
	
	public void sleepTimer()
	{
		System.out.println("..."+this.getVendor()+" Mobile display goes to sleep in 20 secs ");
	}
}
