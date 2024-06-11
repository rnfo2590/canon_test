package model;


public class Weapon {

	private String name;
	private int offensivePower;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOffensivePower() {
		return offensivePower;
	}

	public void setOffensivePower(int offensivePower) {
		this.offensivePower = offensivePower;
	}

	public Weapon(String name,int offensivePower) {
		this.name = name;
		this.offensivePower = offensivePower;
	}
}
