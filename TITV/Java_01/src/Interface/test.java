package Interface;

public class test {
	public static void main(String[] args) {
		
		double arr[] = new double[] {1 , 5 , 3 , 7 , 8};
		InsertionSort tt = new InsertionSort();
		tt.sapXepGiam(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+" "+arr[i]);
		}
	}
}
