import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Can_bo cb1 = new Can_bo("Lê Quang Huy",     "phòng 1",  20, 5, "VICE_HEAD");
		Can_bo cb2 = new Can_bo("Nguyễn Quang Nam", "phòng 2",  21, 6, "STAFF");
		Can_bo cb3 = new Can_bo("Lê Văn Dương",     "phòng 3",  22, 7, "BACHELOR");
		Can_bo cb4 = new Can_bo("Triệu Quang Hùng", "phòng 4",  23, 8, "DOCTOR");
		Can_bo cb5 = new Can_bo("Lê Thị Hồng",      "phòng 5",  24, 9, "MASTER");
		Can_bo cb6 = new Can_bo("Trần Văn Hùng",    "phòng 6",  25, 1, "VVVVV");
		Can_bo cb7 = new Can_bo("Triệu Việt Vương", "phòng 7",  26, 2, "DEPARTMENT_HEAD");
		Can_bo cb8 = new Can_bo("An Toàn Việt", "    phòng 8",  27, 3, "TTTTTT");
		Can_bo cb9 = new Can_bo("Trần Đức Việt",   "phòng 9",  28, 4, "STAFF");
		Can_bo cb10 = new Can_bo("Lê Hồng Phông",   "phòng 10", 29, 5, "BACHELOR");
		Can_bo cb11 = new Can_bo("Lê Quang Liêm",   "phòng 11", 30, 6, "DOCTOR");
		Can_bo cb12 = new Can_bo("Hoàng Xuân Vinh", "phòng 12", 31, 7, "MASTER");
		
		giao_su gs1 = new giao_su("Lê Quang Huy", "good", 500, "DOTOR", 200, 10);
		giao_su gs2 = new giao_su("Lê Quang Hùng", "bad", 600, "MSTER", 200, 9);
		giao_su gs3 = new giao_su("Lê Quang Tuấn", "good", 700, "DOCTOR", 200, 8);
		giao_su gs4 = new giao_su("An Toàn Việt", "very good", 800, "BACHELOR", 200, 7);
		giao_su gs5 = new giao_su("Nguyễn Huy Hùng", "very bad", 900, "DOCTOR", 200, 6);
		// Ex1:Tìm kiếm nhân viên theo tên và phòng ban, sau đó in các thông tin của họ lên màn hình:

		Scanner sc = new Scanner(System.in);
		String FindName;
		System.out.print("\nBạn cần tìm thông tim của cán bộ có tên: ");
		FindName = sc.nextLine();
		boolean t = false;
		for (Can_bo ccb : Can_bo.cb) {

			if (FindName.equals(ccb.FullName)) {
				t = true;
				System.out.println("Thông tin của người đó là: ");
				System.out.println("FullName: " + ccb.FullName);
				System.out.println("Department: " + ccb.Department);
				System.out.println("Working time: " + ccb.WorkingTime);
				System.out.println("SalaryMultiplier: " + ccb.SalaryMultiplier);
				System.out.println("position: " + ccb.position);
				System.out.println("Allowance: " + ccb.Allowance);
				System.out.println("Salary: " + ccb.salary+"\n");
				break;
			}
		}

		if (t == false) {
			System.out.println("Trong danh sách không có tên này \n\n\n");
		}
		
		
		// Ex2: Xuất ra danh sách tất cả các giáo sư và sawo=ps xếp theo tên của họ:
		


		giao_su.in();

	}

}
