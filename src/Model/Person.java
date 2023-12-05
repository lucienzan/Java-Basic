package Model;

public class Person {
	Person(String name, int age)
	{
		this.Name = name;
		this.Age = age;
	}
	String Name;
	int Age;

	public String GetInfo(){
		return this.Name+"\n"+this.Age+"\n";
	}
}
