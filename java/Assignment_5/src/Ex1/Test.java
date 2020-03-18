package Ex1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bạn muốn sắp xếp mảng có bao nhiêu phần tử: ");
		int n = sc.nextInt();

		// Sắp xếp bằng QuickSort
		QuickSort sq = new QuickSort(n);
		sq.input();
		int[] arr1 = sq.arr;
		int[] arr2 = sq.arr;
		sq.sort(sq.arr);
		sq.print(sq.arr);

		// Sắp xếp bằng SelectionSort
		SelectionSort ss = new SelectionSort(n);
		ss.sort(arr1);
		ss.print(arr1);

		// Sắp xếp bằng InsertSort
		InsertSort is = new InsertSort(n);
		is.sort(arr1);
		is.print(arr1);

	}

}
