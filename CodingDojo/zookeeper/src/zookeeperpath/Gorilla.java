package zookeeperpath;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla has thrown something");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}

	public void eatBananas() {
		System.out.println("Gorilla is satisfied after eating bananas");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}

	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
