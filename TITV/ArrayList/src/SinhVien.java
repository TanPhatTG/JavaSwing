
public class SinhVien {
	String id;
	String name;
	int yearOfBirth;
	double avgPoint;
	public SinhVien() {
		super();
		this.id = "";
		this.name = "";
		this.yearOfBirth = 0;
		this.avgPoint = 0;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public double getAvgPoint() {
		return avgPoint;
	}
	public void setAvgPoint(double avgPoint) {
		this.avgPoint = avgPoint;
	}
	@Override
	public String toString() {
		return "Sinh Vien [ID=" + id + ", name= " + name + ", yearOfBirth= " + yearOfBirth + ", avgPoint= " + avgPoint
				+ "]";
	}

	
}
