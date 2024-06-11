package mondel;


public class Magic {

	String name;
	int magicPower;
	int magicPoint;

	public Magic(String name, int magicPoint, int magicPower) {
		super();
		this.name = name;
		this.magicPower = magicPower;
		this.magicPoint = magicPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMagicPower() {
		return magicPower;
	}

	public void setMagicPower(int magicPower) {
		this.magicPower = magicPower;
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}

	public void magicAttack(Actor yusya, Actor target) {
		System.out.println(yusya.getName() + "は" + this.name + "を唱えた！");
		if (yusya.getMp() < this.magicPoint) {
			System.out.println("しかしMPが足らず何も起こらなかった...");
		} else {
			int smp = yusya.getMp() - this.magicPoint;
			yusya.setMp(smp);

			int tai = target.getHp();
			tai -= this.getMagicPower();

			System.out.println(target.getName() + "に" + this.getMagicPower() + "のダメージを与えた！");
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		}
		target.status();
	}

}
