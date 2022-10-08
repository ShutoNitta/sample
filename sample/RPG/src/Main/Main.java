package Main;

import java.util.Scanner;

import Creature.Character.Human.Human;
import Creature.Character.Human.Hero.Hero;
import Creature.Character.Human.Wizard.Wizard;
import Creature.Monster.Monster;
import Creature.Monster.Dragon.Dragon;
import Creature.Monster.Matango.Matango;
public class Main {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String name = sc.nextLine();
		System.out.println("職業を選択してください(数字で)");
		System.out.println("1:戦士　2:魔法使い	");
		int jobselect = sc.nextInt();
		Human h;
		if(jobselect == 1) {
			h = new Hero(name);
//			h = new Wizard(name);
			System.out.println("戦士" + name + "誕生");
		}else if(jobselect == 2) {
			h = new Wizard(name);
			System.out.println("魔法使い" + name + "誕生");
		}else {
			System.out.println("無効");
			throw new IllegalArgumentException("無効な数字です");
		}
		for(int i = 0; i<20; i++) {
			System.out.println
			(h.getHp() + ":" + h.getLebel() + ":" + h.getMp() + ":" + h.getPower() + ":" + h.getWantExp());
			int select;
			System.out.println("行動を選択してください");
			System.out.println("1:戦闘 2:休憩");
			select = sc.nextInt();

			if(select == 1) {
				Monster m;
				if(i <= 10) {
					m = new Matango("マタンゴ" + i);
				}else {
					m = new Dragon("ドラゴン" + i);
				}
				boolean runj = false;
				while(m.getHp() > 0) {
					System.out.println("バトル行動を選択してください");
					System.out.println("1:攻撃 2:特殊攻撃 3:逃げる");
					int s = sc.nextInt();
					if(s == 1) {
						h.attack(m);
						m.attack(h);
					}else if(s == 2) {
						h.superAttack(m);
						m.attack(h);
					}else if(s == 3) {
						boolean b = h.run(m);
						if(b == true) {
							System.out.println("逃げた");
							runj = true;
							break;
						}else {
							System.out.println("逃げに失敗");
							m.attack(h);
						}
					}
				}
				if(runj == false) {
					h.lebelCount(m.getExp());
				}
			}else if(select == 2) {
				rest(h);
			}else throw new IllegalArgumentException("無効な数字です");
		}
	}
public static Human	battle(Human h) {
	Monster m;
	if(i <= 10) {
		m = new Matango("マタンゴ" + i);
	}else {
		m = new Dragon("ドラゴン" + i);
	}
	boolean runj = false;
	while(m.getHp() > 0) {
		System.out.println("バトル行動を選択してください");
		System.out.println("1:攻撃 2:特殊攻撃 3:逃げる");
		int s = sc.nextInt();
		if(s == 1) {
			h.attack(m);
			m.attack(h);
		}else if(s == 2) {
			h.superAttack(m);
			m.attack(h);
		}else if(s == 3) {
			boolean b = h.run(m);
			if(b == true) {
				System.out.println("逃げた");
				runj = true;
				break;
			}else {
				System.out.println("逃げに失敗");
				m.attack(h);
			}
		}
	}
	if(runj == false) {
		h.lebelCount(m.getExp());
	}

}
public static Human rest(Human h) {
}
}
