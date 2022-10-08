package Creature.Character.Human;

import Creature.Character.Character;
import Creature.Monster.Monster;
import Wepon.Wepon;
public abstract class Human implements Character {
	private int hp;
	private int maxHp;
	private int mp;
	private int maxMp;
	private int speed;
	private int lebel;
	private int power;
	private int wantExp;
	private Wepon wepon;
	private String name;

	public Human(String name) {
		this.setName(name);
		this.setMaxHp(100);
		this.setHp(this.getMaxHp());
		this.setLebel(1);
		this.setWantExp(this.getLebel());
		System.out.println(this.getName() + ":" + this.getHp() + ":" + this.getMp() + ":" + this.getSpeed());
	}

	public void attack(Monster m) {
		System.out.println
		(this.getName() + "の攻撃" + m.getName() + "に" + this.getPower() + "のダメージを与えた");
		m.setHp(m.getHp() - this.getPower());
	}
	public abstract void superAttack(Monster m);
	
	public boolean run(Monster m) {
		if(m.getSpeed() < this.getSpeed()) {
			return true;
		}else return false;
	}
	public void lebelUp() {
		this.setWantExp(this.getLebel());
		this.setMaxHp(this.getMaxHp() + 5);
		this.setMaxMp(this.getMaxMp() + 5);
		this.setPower(this.getPower() + 2);
		this.setSpeed(this.getSpeed() + 1);
	}
	public void lebelCount(int Exp) {
		while(Exp > 0) {
			Exp -= this.getWantExp();
			if(Exp < 0) {
				this.setWantExp(this.getWantExp() - Exp);
			}else {
				this.setLebel(this.getLebel() + 1);
				System.out.println("レベルアップしました。レベル" + this.getLebel());
				System.out.println(this.getName() + ":" + this.getHp() + ":" + this.getMp() + ":" + this.getSpeed());
				lebelUp();
			}
		}
	}
	
	public void dead() {
		System.out.println("Game Over");
		throw new IllegalArgumentException("Game Over");
	}

	public int getHp() {return this.hp;}
	public void setHp(int hp) {
		if(hp <= 0) {
			dead();
		}else if(hp >= this.getMaxHp()) {
			this.hp = this.getMaxHp();
			return;
		}
		this.hp = hp;
	}
	public int getMaxHp() {return this.maxHp;}
	public void setMaxHp(int maxHp) {this.maxHp = maxHp;}
	public int getMp() {return this.mp;}
	public void setMp(int mp) {
		if(mp <= 0) {
			this.mp = 0;
		}else if(mp >= this.getMaxMp()) {
			this.mp = this.getMaxMp();
			return;
		}
		this.mp = mp;
	}
	public int getMaxMp() {return this.maxMp;}
	public void setMaxMp(int maxMp) {this.maxMp = maxMp;}
	public int getSpeed() {return this.speed;}
	public void setSpeed(int speed) {this.speed = speed;}
	public int getLebel() {return this.lebel;}
	public void setLebel(int lebel) {this.lebel = lebel;}
	public int getPower() {return this.power;}
	public void setPower(int power) {this.power = power;}
	public int getWantExp() {return this.wantExp;}
	public void setWantExp(int wantExp) {this.wantExp = wantExp;}
	public Wepon getWepon() {return this.wepon;}
	public void setWepon(Wepon wepon) {this.wepon = wepon;}
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}


}
