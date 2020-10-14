package biology;

	public class MainApp {
	public static void main(String args[])
	{
		/*
		Mammal model1 = new Mammal(3,false);   no longer works since its abstract now
		Mammal model2 = new Human(2,true,false);
		Human model3 = new Human(2,false,true);
		
		model1.canEat();
		model2.canEat();
		model3.canEat();
		model3.canEat(true); 
		*/
		Animal horse1 = new Animal(4,true,true);
		horse1.moving();
		
		System.out.println();
		
		Animal horse2 = new LandAnimal(4,true,true,10);
		horse2.moving();
		
		System.out.println();
		
		LandAnimal horse3 = new LandAnimal(4,true,true,50);
		horse3.moving();
		horse3.moving(30);
		horse3.canEat();
		
		System.out.println();
		
		Animal dolphine1 = new Animal(0,true,false);
		dolphine1.moving();
		
		System.out.println();
		
		Animal dolphine2 = new WaterAnimal(0,true,false,100);
		dolphine2.moving();
		
		System.out.println();
		
		WaterAnimal dolphine3 = new WaterAnimal(0,true,false,100);
		dolphine3.moving();
		dolphine3.moving(50);
		dolphine3.canEat();
		
	}
}
