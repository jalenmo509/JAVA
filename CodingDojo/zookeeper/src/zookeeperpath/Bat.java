package zookeeperpath;

public class Bat extends Mammal {
	public Bat() {
		this.setEnergyLevel(300);
	}

	public void fly() {
		System.out.println("Bat takes off");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}

	public void eatHumans() {
		System.out.println("Bat has eaten humans");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}

	public void attackTown() {
		System.out.println("Town on fire");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}
