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


}
