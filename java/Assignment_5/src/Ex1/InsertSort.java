package Ex1;

public class InsertSort extends SequenceNumber implements Sort {

	InsertSort(int n) {
		super(n);
	}

	@Override
	public void sort(int arr[]) {
       	sap_xep_chen(arr, n);	
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
	
	public static void main(String[] args) {
		QuickSort q = new QuickSort(5);

		q.input();
		
		q.sort(q.arr);
		
		q.print(q.arr);
	}

}
