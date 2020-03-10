package Ex1;

import java.awt.geom.Area;
import java.util.Scanner;

public class SequenceNumber {
	static int n;
	int arr[] = new int[n];

	SequenceNumber(int n) {
		this.n = n;
	}

	public void input() {
		arr = new int[n];
		System.out.println("Hãy nhập " + n + "số từ bàn phím");

		for (int i = 0; i < n; i++) {
			Scanner sc = new Scanner(System.in);
			int g = sc.nextInt();
			arr[i] = g;
		}

		
	}

	public void print(int arr[]) {
		System.out.println("dãy số sau khi sắp xếp là:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
