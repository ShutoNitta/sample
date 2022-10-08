package Creature.Character.Human.Wizard;

import Creature.Character.Human.Human;
import Creature.Monster.Monster;
import Wepon.Wepon;
import Wepon.Wand.Wand;

public class Wizard extends Human{
	public Wizard(String name) {
		super(name);
		Wepon w = new Wand();
		this.setWepon(w);
		this.setMaxMp(25);
		this.setMp(25);
		this.setPower(13 + this.getWepon().getPlusPower());
		this.setSpeed(5);
	}
	public void superAttack(Monster m) {
		System.out.println
		(this.getName() + "の特殊攻撃" + m.getName() + "に" + (this.getPower() + 10) + "のダメージを与えた");
		m.setHp(m.getHp() - (this.getPower() + 10));
		this.setMp(this.getMp() - 10);
	}
}
