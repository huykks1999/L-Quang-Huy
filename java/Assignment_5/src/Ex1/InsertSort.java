package Ex1;

public class InsertSort extends SequenceNumber implements Sort {

	InsertSort(int n) {
		super(n);
	}

	@Override
	public void sort(int arr[]) {
       	sap_xep_chen(arr, n);	
       	System.out.println("Dãy số sau khi sắp xếp bằng InsertSort là: ");
	}
	
	private static void sap_xep_chen(int []A, int n) {
		for(int i=1; i<n; i++) {
			int x = A[i];
			int y = i;
			while( y > 0 && A[ y - 1 ] > x ) {
				A[y]=A[y-1];
				y--;
			}
			A[y]=x;
		}
	}
	
	
	

}
