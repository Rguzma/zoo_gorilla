public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
		super(energyLevel);
	}
    public int throwSomething() {
        energyLevel -= 5;
        System.out.println ("Gorilla has throw something");
        return energyLevel;
    }

    public int eatBanana() {
        this.energyLevel +=10;
        System.out.println ("Gorilla is satisfied");
        return energyLevel;
    }
    public int climbTree() {
        energyLevel -=10;
        System.out.println ("Gorilla has climbed a tree");
        return energyLevel;
    }
}

