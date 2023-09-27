
public class Date {
	int day;
	int mot;
	int year;
	public Date(int day, int mot, int year) {
		super();
		this.day = day;
		this.mot = mot;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMot() {
		return mot;
	}
	public void setMot(int mot) {
		this.mot = mot;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", mot=" + mot + ", year=" + year + "]";
	}
	
	
	
}
