import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Can_bo {
	String FullName;
	String Department;
	int WorkingTime;
	int SalaryMultiplier;
	int Allowance;
	String position;
	int salary;
	static List<Can_bo> cb = new ArrayList<>();

	enum Position {
		BACHELOR(300), MASTER(500), DOCTOR(1000), DEPARTMENT_HEAD(2000), VICE_HEAD(1000), STAFF(500);

		int allowance;

		private Position(int allowance) {
			this.allowance = allowance;
		}
	}

	public Can_bo(String FullName, String Department, int WorkingTime, int SalaryMultiplier,
			String position) {
		this.FullName = FullName;
		this.Department = Department;
		this.WorkingTime = WorkingTime;
		this.SalaryMultiplier = SalaryMultiplier;
		this.position = position;
		this.check();
		this.salary = SalaryMultiplier * 730 + Allowance + WorkingTime * 30;

	}

	public void check() {
		Position d = null;
		try {

			switch (position) {
			case "BACHELOR":
				d = Position.BACHELOR;
				break;

			case "MASTER":
				d = Position.MASTER;
				break;

			case "DOCTOR":
				d = Position.DOCTOR;
				break;

			case "DEPARTMENT_HEAD":
				d = Position.DEPARTMENT_HEAD;
				break;

			case "VICE_HEAD":
				d = Position.VICE_HEAD;
				break;

			case "STAFF":
				d = Position.STAFF;
				break;

			}
			Allowance = d.allowance;
		} catch (NullPointerException g) {
			System.out.println("Tên vị trí nhân viên " + this.FullName + " không hợp lệ, đề nghị nhập lại");
		}
		if (d != null) {
			cb.add(this);
		}

	}

	public static void main(String[] args) {

		Can_bo cb1 = new Can_bo("Lê Quang Huy",     "phòng 1",  20, 5, "VICE_HEAD");
		Can_bo cb2 = new Can_bo("Nguyễn Quang Nam", "phòng 2",  21, 6, "STAFF");
		Can_bo cb3 = new Can_bo("Lê Văn Dương",     "phòng 3",  22, 7, "BACHELOR");
		Can_bo cb4 = new Can_bo("Triệu Quang Hùng", "phòng 4",  23, 8, "DOCTOR");
		Can_bo cb5 = new Can_bo("Lê Thị Hồng",      "phòng 5",  24, 9, "MASTER");
		Can_bo cb6 = new Can_bo("Trần Văn Hùng",    "phòng 6",  25, 1, "VVVVV");
		Can_bo cb7 = new Can_bo("Triệu Việt Vương", "phòng 7",  26, 2, "DEPARTMENT_HEAD");
		Can_bo cb8 = new Can_bo("An Toàn Việt", "    phòng 8",  27, 3, "TTTTTT");
		Can_bo cb9 = new Can_bo("Trần Đức Việt ",   "phòng 9",  28, 4, "STAFF");
		Can_bo cb10 = new Can_bo("Lê Hồng Phông",   "phòng 10", 29, 5, "BACHELOR");
		Can_bo cb11 = new Can_bo("Lê Quang Liêm",   "phòng 11", 30, 6, "DOCTOR");
		Can_bo cb12 = new Can_bo("Hoàng Xuân Vinh", "phòng 12", 31, 7, "MASTER");

		Scanner sc = new Scanner(System.in);
		String FindName;
		System.out.print("\nBạn cần tìm thông tim của người có tên: ");
		FindName = sc.nextLine();
		boolean t = false;
		for (Can_bo ccb : cb) {

			if (FindName.equals(ccb.FullName)) {
				t = true;
				System.out.println("Thông tin của người đó là: ");
				System.out.println("FullName: " + ccb.FullName);
				System.out.println("Department: " + ccb.Department);
				System.out.println("Working time: " + ccb.WorkingTime);
				System.out.println("SalaryMultiplier: " + ccb.SalaryMultiplier);
				System.out.println("position: " + ccb.position);
				System.out.println("Allowance: " + ccb.Allowance);
				System.out.println("Salary: " + ccb.salary);
				break;
			}
		}

		if (t == false) {
			System.out.println("Trong danh sách không có tên này ");
		}

	}

}
