package entities;

public class Champion {

	private String name;
	private int life;
	private int atttack;
	private int armor;
	
	public Champion() {
		
	}

	public Champion(String name, int life, int damage, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.atttack = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getAtttack() {
		return atttack;
	}

	public void setAtttack(int atttack) {
		this.atttack = atttack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		int zeroLife = 0;
		if (armor > other.atttack) {
			this.life -= 1.0;
		}else {
			this.life -= other.atttack - armor;
		}if (this.life <= 0) {
			this.life = zeroLife;
		} 
	}
	
	public String status() { 
		
		if (life == 0) {
			return  name
					+ ": "
					+ life
					+" of life "
					+ "(He dies)";
		}else {
			return  name
					+ ": "
					+ life
					+" of life ";
		}
		
	}
}
