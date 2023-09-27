import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean kiemTraTongTien() {
		return this.tinhTong() > 2050;
	}

	public void printDay() {
		System.out.println("Day: "+this.day);
	}
	
	public void printMonth() {
		System.out.println("Month: "+this.month);
	}
	
	public void printYear() {
		System.out.println("Year: "+this.year);
	}
	public void printDate() {
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	
	public int tinhTong() {
		return this.day + this.month + this.year;
	}



	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}
