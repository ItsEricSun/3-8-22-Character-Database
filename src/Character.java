
public class Character {
	String name;
	String role;
	String level;
	String ability;
	String weakness;
	
	Character(String n, String r, String l, String a, String w){
		name = n;
		role = r;
		level = l;
		ability = a;
		if(w.equals("")) weakness = "None";
		else weakness = w;
	}
}
