
public enum Month {
	Jan(31),
	Fer(29),
	Mar(31),
	Apr(30),
	May(31),
	Jun(30),
	Jul(31),
	Aug(31),
	Sep(30),
	Oct(31),
	Nov(30),
	Dec(31);
	
	private final int numOfDay;

	private Month(int numOfDay) {
		this.numOfDay = numOfDay;
	}

	public int getNumOfDay() {
		return numOfDay;
	}
	

 
	
}
