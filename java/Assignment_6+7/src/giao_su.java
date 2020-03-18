import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class giao_su {

	String FullName;
	String Faculty;
	int allowance;
	String AcademicDegree;
	static List<giao_su> gs = new ArrayList<>();

	enum AcademicDegrees {
		BACHELOR("BACHELOR"), MASTER("MASTER"), DOCTOR("DOCTOR");

		String name;

		private AcademicDegrees(String name) {
			this.name = name;
		}
	}

	int MonthlyTeachingTime;
	int SalaryMultiplier;
	int salary;

	public giao_su(String FullName, String Facult, int allowance, String AcademicDegreeint, int MonthlyTeachingTime,
			int SalaryMultiplier) {
		this.AcademicDegree = AcademicDegreeint;
		this.allowance = allowance;
		this.Faculty = Facult;
		this.FullName = FullName;
		this.MonthlyTeachingTime = MonthlyTeachingTime;
		this.SalaryMultiplier = SalaryMultiplier;
		this.salary = SalaryMultiplier * 730 + allowance + MonthlyTeachingTime * 45;
		this.checkBang();
		gs.add(this);
	}

	void checkBang() {
		AcademicDegrees A = null;
		Scanner sc = new Scanner(System.in);

		try {
			switch (AcademicDegree) {
			case "BACHELOR":
				A = AcademicDegrees.BACHELOR;
				break;
			case "MASTER":
				A = AcademicDegrees.MASTER;
				break;
			case "DOCTOR":
				A = AcademicDegrees.DOCTOR;
			}

			AcademicDegree = A.name;

		} catch (NullPointerException n) {
			System.out.println("Giáo sư " + this.FullName + " có tên bằng cấp không hợp lệ! ");
		}
	}

	static void in() {
		System.out.println();
		System.out.println("Danh sách tất cả các giáo sư: ");
		System.out.println("Full name         " + "Faculty       " + "Allowance       " + "AcademicDegree     "
				+ "MonthlyTeachingTime      " + "SalaryMultiplier        " + "Salary       ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------");
		for (giao_su giao_su : gs) {
			if (giao_su.AcademicDegree == "BACHELOR" || giao_su.AcademicDegree == "MASTER"
					|| giao_su.AcademicDegree == "DOCTOR") {
				System.out.printf("%-17s %-15s %-15d %-20s %-25d %-18d %d \n", giao_su.FullName, giao_su.Faculty,
						giao_su.allowance, giao_su.AcademicDegree, giao_su.MonthlyTeachingTime,
						giao_su.SalaryMultiplier, giao_su.salary);
			}
		}
	}

	
}
