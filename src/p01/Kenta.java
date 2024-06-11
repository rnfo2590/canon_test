package p01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mondel.Actor;
import mondel.Equipment;
import mondel.Magic;
import mondel.Weapon;



public class Kenta extends Actor{
	private int livel;
	Weapon weapon;
	Equipment[] equipments;
	final Magic[] magic = { new Magic("メラ", 2, 10),
			new Magic("メラミ", 5, 15),
			new Magic("メラゾーマ", 10, 30),
			new Magic("メラガイヤー", 20, 60) };

	public Kenta() {
		super();
	}

	public Kenta(String name, int hp, int mp, int attack, int defense) {
		super(name, hp, mp, attack, defense);
		this.livel = 0;

	}

	public int getLivel() {
		return this.livel;
	}

	public void setLivel(int livel) {
		this.livel = livel;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Equipment[] getEquipments() {
		return equipments;
	}

	public void setEquipments(Equipment[] equipments) {
		this.equipments = equipments;
	}

	public Magic[] getMagic() {
		return magic;
	}

	public String attack(Actor target) {
		String display = "";
		if (this.weapon == null) {
			display += this.getName() + "は素手で殴った\n";
			int tai = target.getHp();
			int damage = damageCalculation(this.getAttack(), target.getDefense());
			tai -= damage;
			//System.out.println(this.name + "の攻撃");
			display += target.getName() + "に" + damage + "のダメージを与えた！";
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		} else {
			display += this.getName() + "は" + this.weapon.getName() + "で攻撃した！\n";
			int tai = target.getHp();
			int damage = damageCalculation(this.getAttack() + this.weapon.getOffensivePower(), target.getDefense());
			tai -= damage;
			//System.out.println(this.name + "の攻撃");
			display += target.getName() + "に" + damage + "のダメージを与えた！";
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		}
		return display;
	}

	public String attack2(Actor target) {
		String display = "";
		if (this.livel >= 2) {
			Integer damage = null;
			Random rand = new Random();
			int num = rand.nextInt(3);
			if (num == 0/*||num == 1||num == 2*/) {
				display += this.getName() + "はハンマーで叩いた！\n";
				int tai = target.getHp();
				tai -= target.getHp();
				damage = target.getHp();

				display += target.getName() + "に" + target.getHp() + "のダメージを与えた！";
				if (tai < 0) {
					tai = 0;
				}
				target.setHp(tai);
			} else {
				display += this.getName() + "はハンマーで叩いた！\n";

				//System.out.println(this.name + "の攻撃");
				display += target.getName() + "に" + 0 + "のダメージを与えた！";
				damage = 0;
			}
		}else {
			display += "まだレベルが足らない";
		}
		
		return display;
	}

	public List<Magic> magicList() {
		List<Magic> list = new ArrayList<>();
		System.out.println("魔法リスト\n");
		System.out.println("魔法の名前（消費MP/威力）");
		System.out.println("----------------");
		for (int i = 0; i <= this.livel; i++) {
			System.out.println("[" + (i + 1) + "]　" + this.getMagic()[i].getName() + "(" +
					this.getMagic()[i].getMagicPoint() + "/" +
					this.getMagic()[i].getMagicPower() + ")");
			list.add(this.getMagic()[i]);
		}
		System.out.println("----------------");

		return list;
	}

	public void magicAttack(Actor target, Integer magicNo) {
		for (int i = 0; i < 1; i++) {

			if (magicNo - 1 <= livel) {
				this.getMagic()[magicNo - 1].magicAttack(this, target);
			} else {
				System.out.println("覚えている魔法を選択してください");
				i--;
			}
		}
	}
}
