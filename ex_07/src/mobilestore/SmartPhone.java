package mobilestore;

public class SmartPhone extends MobilePhone {
private Integer numberOfCameras;
	
	public SmartPhone()
	{
		super();
		this.setNumberOfCameras(0);
	}
	
	public SmartPhone(Integer displaySize, String vendor, Integer batteryAmps, Integer numberOfCameras)
	{
		super(displaySize,vendor,batteryAmps);
		this.setNumberOfCameras(numberOfCameras);
	}

	public void sleepTimer()
	{
		System.out.println("..."+this.getVendor()+" Mobile display goes to sleep in 10 secs ");
	}
	
	public Integer getNumberOfCameras() {
		return numberOfCameras;
	}

	public void setNumberOfCameras(Integer numberOfCameras) {
		this.numberOfCameras = numberOfCameras;
	}
	
	
}
