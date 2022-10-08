package Creature.Monster;

import Creature.Character.Human.Human;

public class Monster {
	private int hp;
	private int speed;
	private int power;
	private int exp;
	private String name;

	public Monster(String name) {
		this.setName(name);
	}

	public void attack(Human h) {
		System.out.println
		(this.getName() + "の攻撃" + h.getName() + "は、" + this.getPower() + "のダメージ");
		h.setHp(h.getHp() - this.getPower());
	}

	public int getHp() {return this.hp;}
	public void setHp(int hp) {this.hp = hp;}
	public int getPower() {return this.power;}
	public void setPower(int power) {this.power = power;}
	public int getSpeed() {return this.speed;}
	public void setSpeed(int speed) {this.speed = speed;}
	public int getExp() {return this.exp;}
	public void setExp(int exp) {this.exp = exp;}
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}

}
