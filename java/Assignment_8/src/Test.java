import java.io.Console;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Test {

	static Random rd = new Random();
    
	
	// Hàm khởi tạo cho các list Bee
	static void begin() {
		Queen.queen.clear();

		Worker.worker.clear();

		Drone.drone.clear();
		for (int i = 0; i < 10; i++) {
			Queen.queen.add(new Queen());
			Worker.worker.add(new Worker());
			Drone.drone.add(new Drone());

		}
	}
    
	// Hàm in ra danh sách Bee
	static void in() {
		int k = -1;
		int l = -1;
		int o = -1;
		String nameWorker[] = new String[10];
		String nameQueen[] = new String[10];
		String nameDrone[] = new String[10];

		for (int i = 0; i < 10; i++) {

			nameWorker[i] = "Worker" + (i + 1);
			nameQueen[i] = "Queen" + (i + 1);
			nameDrone[i] = "Drone" + (i + 1);
		}

		String[] WorkerHealthStatus = new String[20];
		String[] QueenHealthStatus = new String[20];
		String[] DroneHealthStatus = new String[20];

		int WorkerHealth[] = new int[10];
		int QueenHealth[] = new int[10];
		int DroneHealth[] = new int[10];
		for (Queen Q : Queen.queen) {
			l++;
			QueenHealth[l] = Q.health;
			Q.checkHealthStatus();
			QueenHealthStatus[l] = Q.status;

		}

		for (Worker W : Worker.worker) {
			k++;
			WorkerHealth[k] = W.health;
			W.checkHealthStatus();
			WorkerHealthStatus[k] = W.status;

		}

		for (Drone D : Drone.drone) {
			o++;
			DroneHealth[o] = D.health;
			D.checkHealthStatus();
			DroneHealthStatus[o] = D.status;

		}

		for (int j = 0; j < 10; j++) {
			System.out.printf("%-8s%s%-10s %-7s%s%-10s %-8s%s%-10s\n", nameWorker[j], ": ", WorkerHealthStatus[j],
					nameQueen[j], ": ", QueenHealthStatus[j], nameWorker[j], ": ", WorkerHealthStatus[j]);
		}
	}

	
	//Hàm tấn công tất cả Bee
	static void Attack() {
		for (Queen Q : Queen.queen) {
			Q.damage(rd.nextInt(81));
		}

		for (Worker W : Worker.worker) {
			W.damage(rd.nextInt(81));

		}

		for (Drone D : Drone.drone) {
			D.damage(rd.nextInt(81));

		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		int h;
		int to = 1;
		int ho;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nDanh sách Bee mới: ");
			to = 1;
			begin();
			in();

			System.out.println("\nMời bạn nhập vào chức năng tiếp theo(1/2): ");
			System.out.println("1. Tạo danh sách Bee mới: ");
			System.out.println("2. Tấn công Bee:");
			System.out.print("Xin mời nhập chức năng: ");
			h = sc.nextInt();

			if (h != 1 && h != 2) {
				do {
					System.out.print("Bạn đã nhập sai, xin mời nhập lại: ");
					h = sc.nextInt();

				} while (h != 1 && h != 2);
			}
			if (h == 1) {

			} else if (h == 2) {
				do {

					System.out.println("Sau khi tấn công lần " + to + " : ");
					Attack();
					in();
					System.out.println("\nMời bạn nhập vào chức năng tiếp theo(1/2): ");
					System.out.println("1. Tạo danh sách Bee mới: ");
					System.out.println("2. Tấn công Bee:");
					System.out.print("Xin mời nhập chức năng: ");
					h = sc.nextInt();
					if (h != 1 && h != 2) {
						do {
							System.out.print("Bạn đã nhập sai, xin mời nhập lại: ");
							h = sc.nextInt();

						} while (h != 1 && h != 2);
					}

					to++;
				} while (h == 2);
			}
		} while (h == 1);
	}

}
