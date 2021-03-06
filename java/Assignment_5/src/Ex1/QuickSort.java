package Ex1;

public class QuickSort extends SequenceNumber implements Sort {

	QuickSort(int n) {
		super(n);
	}
    @Override
	public void sort(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		quickSort(arr, left, right);
		System.out.println("Dãy số sau khi sắp xếp bằng QuickSort là: ");

	}
	
	public static void quickSort(int[] arr, int left, int right) {
	    if (arr == null || arr.length == 0)
	      return;

	    if (left >= right)
	      return;

	    int middle = left + (right - left) / 2;
	    int pivot = arr[middle];
	    int i = left, j = right;

	    while (i <= j) {
	      while (arr[i] < pivot) {
	        i++;
	      }

	      while (arr[j] > pivot) {
	        j--;
	      }

	      if (i <= j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        i++;
	        j--;
	      }
	    }

	    if (left < j)
	      quickSort(arr, left, j);

	    if (right > i)
	      quickSort(arr, i, right);
	  }


	

}
