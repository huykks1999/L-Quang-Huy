package Ex1;

public class SelectionSort extends SequenceNumber implements Sort {

	SelectionSort(int n) {
		super(n);
	}

	@Override
	public void sort(int arr[]) {
		sap_xep_chon(arr, n);
		System.out.println("Dãy số sau khi sắp xếp bằng SelectionSort là:");
	}
	
	private static void hoan_vi(int []A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	private static void sap_xep_chon(int []A, int n) {
		for(int i=0; i<n-1; i++) {
			int minArr = i;
			for(int j=i+1; j<n; j++) {
				if(A[minArr]>A[j]) {
					minArr = j;
				}
			}
			if(i!=minArr)
				hoan_vi(A, minArr, i);
		}
	}
	
	
	
	

}
