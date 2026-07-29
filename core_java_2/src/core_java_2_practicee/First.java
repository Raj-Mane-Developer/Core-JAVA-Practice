package core_java_2_practicee;

public class First {


		public static void main(String[] args) {
		
		Car car=new Car();
		
		car.run(106, "BB", 69);
		
		}

	}
	class Car
	{
		String colour;
		double price;
		String company;
		
		public void run(int i, String s , int j)
		{
			System.out.println("car is running");
			System.out.println(i+j);
			System.out.println(s.toUpperCase());
		}


	}
