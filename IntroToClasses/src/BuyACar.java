import java.util.ArrayList;

public class BuyACar
	{
		private static ArrayList<Car> dealership = new ArrayList<Car>();
		public static void main(String[] args)
			{
				dealership.add(new Car("Toyata", "Corrola", 2008));
				dealership.add(new Car("Ford", "F150", 2005));
				dealership.add(new Car("Ford", "Mustang", 1969));
				dealership.add(new Car("Honda", "Pilot", 1996));
				dealership.add(new Car("Apple", "No-Windows", 2015));
				System.out.println(dealership.get(2).getModel());
			}

	}
