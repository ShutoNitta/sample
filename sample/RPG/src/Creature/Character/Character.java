package Creature.Character;

import Creature.Monster.Monster;

public interface Character {
	void attack(Monster m);
	boolean run(Monster m);
	void lebelUp();
	void dead();
}
