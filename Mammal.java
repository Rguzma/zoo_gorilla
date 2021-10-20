class Mammal {  /*Member variables are typically declared inside the class before any method and are accessed via getter and setter methods. The variables themselves should almost always be declared as private to prevent access directly to the field.*/
    public int energyLevel = 100;
    public int displayEnergy() {
        System.out.println (energyLevel);
        return energyLevel;
    }
    // public int energyIncrease(int sum) {
    //     energyLevel += sum;
    //     System.out.println (energyLevel);
    //     return energyLevel;
    // }


    public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}