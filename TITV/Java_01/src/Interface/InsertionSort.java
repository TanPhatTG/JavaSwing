package Interface;

public class InsertionSort implements CacThuatToanSapXep {

	
	@Override
	public void sapXepTang(double[] arr) {
		for(int i = 1; i < arr.length ; i++) {
			int j = i-1;
			double key = arr[i]; 
			while (j  >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		for(int i = 1; i < arr.length ; i++) {
			int j = i-1;
			double key = arr[i]; 
			while (j  >= 0 && arr[j] < key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}

	}

}
