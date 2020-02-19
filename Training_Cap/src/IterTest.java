public class IterTest {

	public static void main(String[] args) 
	{
		Car c = new Car();
		Bus b = new Bus();
		c.setTyres(5);
		b.setTyres(8);
		System.out.println("Car Tyres: "+c.getTyres());
		System.out.println("Bus Tyres: "+b.getTyres());
	}

}
