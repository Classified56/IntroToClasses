
public class Car
	{
		private String make;
		private String model;
		private int year;
		public Car(String mk, String md, int yr)
			{
				make = mk;
				model = md;
				year = yr;
			}
		
		public String getMake()
			{
				return make;
			}

		public void setMake(String make)
			{
				this.make = make;
			}

		public String getModel()
			{
				return model;
			}

		public void setModel(String model)
			{
				this.model = model;
			}

		public int getYear()
			{
				return year;
			}

		public void setYear(int year)
			{
				this.year = year;
			}

	}