package core_java_2_practicee;

public class First {

	public static void main(String[] args) {
	
	Student one=new Student();
	
	
	}

}
class Student
{
	String name ;
	String Email;
	
	public void setName(String nm)
	{
		if(nm.length()>=4)
		{
			this.name=nm;
		}
	}



}