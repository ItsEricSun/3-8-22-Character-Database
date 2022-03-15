
public class Character {
	String name;
	String role;
	String level;
	String ability;
	String weakness;
	String d;
	
	Character(String n, String r, String l, String a, String w){
		name = n;
		role = r;
		level = l;
		ability = a;
		if(w.equals("")) weakness = "None";
		else weakness = w;
		d = name + role + level + ability + weakness;
	}
	
	public String toString() {
		return "Name: " + name + "\nClass: " + role + "\nLevel: " + level + "\nSpecial Ability: " + ability + "\nWeakness: " + weakness;
	}
	
//	public String getData() {
//		return data2;
//	}
}
