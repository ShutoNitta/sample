package Creature.Character.Human.Hero;

import Creature.Character.Human.Human;
import Creature.Monster.Monster;
import Wepon.Wepon;
import Wepon.Sword.Sword;

public class Hero extends Human {
	public Hero(String name) {
		super(name);
		Wepon w = new Sword();
		this.setWepon(w);
		this.setMaxMp(15);
		this.setMp(this.getMaxMp());
		this.setPower(10 + this.getWepon().getPlusPower());
		this.setSpeed(10);
		this.setSpeed(12);
	}
	public void superAttack(Monster m) {
		System.out.println
		(this.getName() + "の特殊攻撃" + m.getName() + "に" + this.getPower() + "のダメージを与えた");
		m.setHp(m.getHp() - (this.getPower() + 5));
		this.setMp(this.getMp() - 10);
	}
}
