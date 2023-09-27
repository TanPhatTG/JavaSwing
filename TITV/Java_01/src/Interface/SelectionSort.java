package Interface;

//import java.util.Iterator;

public class SelectionSort implements CacThuatToanSapXep {

	
	@Override
	public void sapXepTang(double[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					double temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					double temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

	}

}
