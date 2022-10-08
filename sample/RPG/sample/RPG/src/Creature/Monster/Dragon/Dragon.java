package Creature.Monster.Dragon;

import Creature.Monster.Monster;

public class Dragon extends Monster{
	public Dragon(String name) {
		super(name);
		this.setExp(10);
		this.setHp(50);
		this.setPower(15);
		this.setSpeed(10);
	}
}
