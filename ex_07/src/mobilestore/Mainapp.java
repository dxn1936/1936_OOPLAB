package mobilestore;

public class Mainapp {
	public static void main(String args[])
	{
		
		MobilePhone mob1 = new GreyscaleFeaturePhone(3,"LAVA",3500,false);
		MobilePhone mob2 = new SmartFeaturePhone(4,"MI",4000,true);
		MobilePhone mobiles[] = {mob1,mob2};
		
		for(int i=0; i < mobiles.length; i++)
		{
			mobiles[i].switchOn();
			
		}
		
		for(int i = 0;i<mobiles.length;i++)
		{
			mobiles[i].sleepTimer();
			
		}
		
	}
}
