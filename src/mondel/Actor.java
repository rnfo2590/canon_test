package mondel;

public class Actor {
	// フィールド（名前、生命力、攻撃力）
	private String name;
	private int maxHp;
	private int hp;
	private int attack;
	private int defense;
	private int mp;
	private int maxMp;

	// コンストラクタ
	public Actor(String name, int hp, int mp, int attack, int defense) {
		this.name = name;
		this.maxHp = hp;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.mp = mp;
		this.maxMp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	public Actor() {
		super();
	}

	// 情報取得用toStringメソッド
	public String toString() {
		return this.name + "(HP:" + hp + "/" + maxHp + ")(MP:" + mp + "/" + maxMp + ")";
	}

	// 攻撃メソッド（★追加）
	public String attack(Actor target) {
		String display = "";
		target.hp -= this.attack;
		//System.out.println(this.name + "の攻撃");
		display += target.name + "に" + this.attack + "のダメージを与えた！";
		if (target.hp < 0) {
			target.hp = 0;
		}
		return display;
	}

	public String attack2(Actor target) {
		String display = "";
		target.hp -= this.attack;
		//System.out.println(this.name + "の攻撃");
		display += target.name + "に" + this.attack + "のダメージを与えた！";
		if (target.hp < 0) {
			target.hp = 0;
		}
		return display;
	}

	public String heal() {
		String display = "";
		int heal = this.getHp() + this.maxHp / 2;
		if (heal > maxHp) {
			heal = maxHp;
		}
		this.setHp(heal);
		display += this.getName() + "はHPを回復した！";
		return display;
	}

	public Integer status() {
		System.out.println(toString());
		double hp100 = 100 * this.hp / this.maxHp;

		if (hp100 > 90) {
			return 10;
		} else if (hp100 > 80) {
			return 9;
		} else if (hp100 > 70) {
			return 8;
		} else if (hp100 > 60) {
			return 7;
		} else if (hp100 > 50) {
			return 6;
		} else if (hp100 > 40) {
			return 5;
		} else if (hp100 > 30) {
			return 4;
		} else if (hp100 > 20) {
			return 3;
		} else if (hp100 > 10) {
			return 2;
		} else if (hp100 > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public int damageCalculation(int attack, int defense) {
		int damage = attack - defense;
		if (damage < 0) {
			damage = 0;
		}
		return damage;
	}

}