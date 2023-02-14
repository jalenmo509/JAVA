package zookeeperpath;

public class Mammal {
	private int energyLevel;

	public Mammal() {
		this.setEnergyLevel(100);
	}

	public int displayEnergy() {
		System.out.println("Energy level: " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
