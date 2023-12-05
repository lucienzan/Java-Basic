package Model;

public class Hero extends Person {
	String Power;
	
	 public Hero(String name, int age, String skill){
		super(name,age);
		this.Power = skill;
	}
}
