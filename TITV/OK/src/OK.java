
public class OK {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("Akmmokmkomko");
		}
		
		long time2 = System.currentTimeMillis();
		
		System.err.println("Time truoc for: "+time1);
		System.err.println("Time sau for: "+time2);
		System.err.println("Time : "+(time2-time1)/1000);
	}
}
