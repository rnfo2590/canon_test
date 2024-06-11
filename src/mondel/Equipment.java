package mondel;


public class Equipment {
	
	private String name;
	private int defensePower;
	
	public Equipment(String name, int defensePower) {
		super();
		this.name = name;
		this.defensePower = defensePower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}
	
}
