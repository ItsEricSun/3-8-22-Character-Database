import java.util.ListIterator;

import javax.swing.*;
import BreezySwing.*;

public class GUI extends GBFrame {

	static JFrame frm;
	DoublyLinkedList<Character> characters = new DoublyLinkedList<>();
	ListIterator<Character> it = characters.iterator();
	Character c;
	JTextArea outputArea;
	JButton insert1Button, insert2Button, previousButton, addButton, add2Button, modifyButton, modify2Button, removeButton, nextButton;
	JButton backButton;
	JButton backEditButton;
	JTextField nameField, roleField, levelField, abilityField, weaknessField;

	public void insert1() {
		JLabel label = addLabel("Enter first character:", 1,1,1,1);
		JLabel nameLabel = addLabel("Name", 2,1,1,1);
		nameField = addTextField("", 2,2,1,1);
		JLabel roleLabel = addLabel("Class", 3,1,1,1);
		roleField = addTextField("", 3,2,1,1);
		JLabel levelLabel = addLabel("Level", 4,1,1,1);
		levelField = addTextField("", 4,2,1,1);
		JLabel abilityLabel = addLabel("Special Ability", 5,1,1,1);
		abilityField = addTextField("", 5,2,1,1);
		JLabel weaknessLabel = addLabel("Weakness (if none, leave blank)", 6,1,1,1);
		weaknessField = addTextField("", 6,2,1,1);
		insert1Button = addButton("Add", 7,1,2,1);
	}
	
	public void insert2() {
		frm.getContentPane().removeAll();
		frm.setSize(500, 250);
		frm.repaint();
		JLabel label = addLabel("Enter second character:", 1,1,1,1);
		JLabel nameLabel = addLabel("Name", 2,1,1,1);
		nameField = addTextField("", 2,2,1,1);
		JLabel roleLabel = addLabel("Class", 3,1,1,1);
		roleField = addTextField("", 3,2,1,1);
		JLabel levelLabel = addLabel("Level", 4,1,1,1);
		levelField = addTextField("", 4,2,1,1);
		JLabel abilityLabel = addLabel("Special Ability", 5,1,1,1);
		abilityField = addTextField("", 5,2,1,1);
		JLabel weaknessLabel = addLabel("Weakness (if none, leave blank)", 6,1,1,1);
		weaknessField = addTextField("", 6,2,1,1);
		insert2Button = addButton("Add", 7,1,2,1);
		frm.validate();
	}
	
	public void mainMenu() {
		frm.getContentPane().removeAll();
		frm.setSize(500, 180);
		frm.repaint();
		outputArea = addTextArea(c.toString(), 1, 1, 5, 6);
		previousButton = addButton("Previous", 7,1,1,1);
		addButton = addButton("Add", 7,2,1,1);
		modifyButton = addButton("Modify", 7,3,1,1);
		removeButton = addButton("Remove", 7,4,1,1);
		nextButton = addButton("Next", 7,5,1,1);
		frm.validate();
	}
	
	public void add() {
		frm.getContentPane().removeAll();
		frm.setSize(500, 250);
		frm.repaint();
		JLabel label = addLabel("Enter character:", 1,1,1,1);
		JLabel nameLabel = addLabel("Name", 2,1,1,1);
		nameField = addTextField("", 2,2,1,1);
		JLabel roleLabel = addLabel("Class", 3,1,1,1);
		roleField = addTextField("", 3,2,1,1);
		JLabel levelLabel = addLabel("Level", 4,1,1,1);
		levelField = addTextField("", 4,2,1,1);
		JLabel abilityLabel = addLabel("Special Ability", 5,1,1,1);
		abilityField = addTextField("", 5,2,1,1);
		JLabel weaknessLabel = addLabel("Weakness (if none, leave blank)", 6,1,1,1);
		weaknessField = addTextField("", 6,2,1,1);
		backButton = addButton("Back", 7,1,1,1);
		add2Button = addButton("Add", 7,2,1,1);
		frm.validate();
	}
	
	public void modify() {
		frm.getContentPane().removeAll();
		frm.setSize(500, 250);
		frm.repaint();
		JLabel label = addLabel("Modify character:", 1,1,1,1);
		JLabel nameLabel = addLabel("Name", 2,1,1,1);
		nameField = addTextField(c.name, 2,2,1,1);
		JLabel roleLabel = addLabel("Class", 3,1,1,1);
		roleField = addTextField(c.role, 3,2,1,1);
		JLabel levelLabel = addLabel("Level", 4,1,1,1);
		levelField = addTextField(c.level, 4,2,1,1);
		JLabel abilityLabel = addLabel("Special Ability", 5,1,1,1);
		abilityField = addTextField(c.ability, 5,2,1,1);
		JLabel weaknessLabel = addLabel("Weakness (if none, leave blank)", 6,1,1,1);
		weaknessField = addTextField(c.weakness, 6,2,1,1);
		backButton = addButton("Back", 7,1,1,1);
		modify2Button = addButton("Modify", 7,2,1,1);
		frm.validate();
	}
	
	public GUI() {
		insert1();
	}
	
	public void buttonClicked(JButton buttonObj) {
		if(buttonObj == insert1Button) {
			String name = nameField.getText();
			String role = roleField.getText();
			String level = levelField.getText();
			String ability = abilityField.getText();
			String weakness = weaknessField.getText();
			if(name.equals("")) {
				messageBox("Error: Please Enter Name");
				return;
			} else if(role.equals("")) {
				messageBox("Error: Please Enter Class");
				return;
			} else if(level.equals("")) {
				messageBox("Error: Please Enter Level");
				return;
			} else if(ability.equals("")) {
				messageBox("Error: Please Enter Ability");
				return;
			}
			Character c = new Character(name, role, level, ability, weakness);
			characters.add(c);
			insert2();
		} else if(buttonObj == insert2Button) {
			String name = nameField.getText();
			String role = roleField.getText();
			String level = levelField.getText();
			String ability = abilityField.getText();
			String weakness = weaknessField.getText();
			if(name.equals("")) {
				messageBox("Error: Please Enter Name");
				return;
			} else if(role.equals("")) {
				messageBox("Error: Please Enter Class");
				return;
			} else if(level.equals("")) {
				messageBox("Error: Please Enter Level");
				return;
			} else if(ability.equals("")) {
				messageBox("Error: Please Enter Ability");
				return;
			}
			Character x = new Character(name, role, level, ability, weakness);
			characters.add(x);
			it = characters.iterator();
			reachEnd();
			mainMenu();
		} else if(buttonObj == previousButton) {
			if(it.hasPrevious()) {
				c = it.previous();
				mainMenu();
			}
		} else if(buttonObj == nextButton) {
			if(it.hasNext()) {
				c = it.next();
				mainMenu();
			}
		} else if(buttonObj == backButton) {
			mainMenu();
		} else if(buttonObj == addButton) {
			add();
		} else if(buttonObj == add2Button) {
			String name = nameField.getText();
			String role = roleField.getText();
			String level = levelField.getText();
			String ability = abilityField.getText();
			String weakness = weaknessField.getText();
			if(name.equals("")) {
				messageBox("Error: Please Enter Name");
				return;
			} else if(role.equals("")) {
				messageBox("Error: Please Enter Class");
				return;
			} else if(level.equals("")) {
				messageBox("Error: Please Enter Level");
				return;
			} else if(ability.equals("")) {
				messageBox("Error: Please Enter Ability");
				return;
			}
			Character x = new Character(name, role, level, ability, weakness);
			characters.add(x);
			reachEnd();
			mainMenu();
		} else if(buttonObj == modifyButton) {
			modify();
		} else if(buttonObj == modify2Button) {
			String name = nameField.getText();
			String role = roleField.getText();
			String level = levelField.getText();
			String ability = abilityField.getText();
			String weakness = weaknessField.getText();
			if(name.equals("")) {
				messageBox("Error: Please Enter Name");
				return;
			} else if(role.equals("")) {
				messageBox("Error: Please Enter Class");
				return;
			} else if(level.equals("")) {
				messageBox("Error: Please Enter Level");
				return;
			} else if(ability.equals("")) {
				messageBox("Error: Please Enter Ability");
				return;
			}
			Character x = new Character(name, role, level, ability, weakness);
			it.set(x);
			c = x;
			mainMenu();
		} else if(buttonObj == removeButton) {
			if(characters.size() > 1) {
				it.remove();
				if(it.hasNext()) {
					c = it.next();
				} else if(it.hasPrevious()) {
					c = it.previous();
				} else if(characters.size() == 1) {
					c = characters.getHead().data;
				}
				mainMenu();
			}
		}
	}
	
	public static void main(String[] args) {
		frm = new GUI();
		frm.setTitle("Characters");
		frm.setSize(500, 250);
		frm.setVisible(true);
	}
	
	public void reachEnd() {
		while(it.hasNext()) {
			c = it.next();
		}
	}
}
