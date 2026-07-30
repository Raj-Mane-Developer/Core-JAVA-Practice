package core_java_2_practicee;

public class First {


		public static void main(String[] args) {
		
			Animal animal=new Animal(20,22);
		
		}
	}
class Animal
{
	int age;
	int age2;
	
	public Animal()
	{
		System.out.println();
	}
	public Animal (int age)
	{
		this.age=age;
		
	}
	public Animal(int i , int j)
	{
	System.out.println( i+j);	
	this.age=i;
	this.age2=j;
	}
}