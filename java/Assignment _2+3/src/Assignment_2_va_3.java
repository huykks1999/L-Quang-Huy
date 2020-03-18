import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Random;

public class Assignment_2_va_3 {

	public static void main(String[] args) {
		// Questions 1:

		String họ[] = { "Lê", "Trần", "Nguyễn", "Cao", "Trương", "Đào", "Tống" };
		String Tên_đệm[] = { "Văn", "Phong", "Hồng", "Thị", "Quang", "Thanh", "Tiến" };
		String Tên[] = { "Huy", "Việt", "Cường", "Trang", "Hiếu", "Anh", "Hoa" };

		String Full_name[] = new String[10];

		for (int i = 0; i < Full_name.length; i++) {
			Random rd = new Random();
			int l = rd.nextInt(6);
			Full_name[i] = họ[l] + " " + Tên_đệm[l] + " " + Tên[l];
		}
		;
		/*
		 * String Full_name[] =
		 * {"Lê Quang Huy","Trần Quang Hiếu","Cao Thị Trang","Tống Thanh Hoa"
		 * ,"Cao Tiến Cường",
		 * "Đào Quang Việt","Lê Quang Anh","Nguyễn Thanh Trang","Cao Hồng Anh"
		 * ,"Trương Thị Hoa"};
		 */

		// Questions 2:
		String ID[] = { "SV1234567", "SV3344334", "SV7644543", "SV1275358", "SV0787654", "SV1276345", "SV6543454",
				"SV3745764", "SV6784123", "SV1847273" };

		// Questions 3:
		String Birth_date[] = { "29/10/1991", "29/09/1991", "29/08/1991", "29/07/1991", "29/06/1991", "29/05/1991",
				"29/04/1991", "29/03/1991", "29/02/1991", "29/01/1991" };

		// Questions 4:
		System.out.println("Full_name                      ID                     Date      ");
		System.out.println("------------------------------------------------------------------");
		for (int i = 0; i < ID.length; i++) {
			// String info[] = {Full_name[i], ID[i], Birth_date[i]};
			System.out.println(Full_name[i] + "              " + ID[i] + "                " + Birth_date[i]);
		}

		// assignment 3:

		// Questions 1:
		int diem_1[] = { 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int diem_2[] = { 1, 2, 3, 4, 5, 1, 7, 8, 9, 10 };
		int diem_3[] = { 7, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int diem_4[] = { 5, 2, 3, 4, 5, 6, 7, 8, 1, 10 };
		int diem_5[] = { 10, 2, 3, 4, 5, 6, 7, 4, 9, 10 };

		// Questions 2:

		double avg_diem[] = new double[10];

		for (int i = 0; i < diem_1.length; i++) {
			avg_diem[i] = (diem_1[i] + diem_2[i] + diem_3[i] + diem_4[i] + diem_5[i]) / 5;
		}
		;
		ArrayList l1 = new ArrayList();
		for (int i = 0; i < avg_diem.length; i++) {
			l1.add(avg_diem[i]);
		}


		System.out.println(
				"\n\n_____________________________________________________________________________________________");
		System.out.println(
				"Full_name                ID               Date         đ1     đ2    đ3    đ4    đ5       AVG");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		try {
			do {
				for (int i = 0; i < ID.length; i++) {
					double g = (double) Collections.max(l1);

					if (avg_diem[i] == g) {
						System.out.println(Full_name[i] + "         " + ID[i] + "        " + Birth_date[i] + "      "
								+ diem_1[i] + "       " + diem_2[i] + "     " + diem_3[i] + "     " + diem_4[i]
								+ "     " + diem_5[i] + "                    " + avg_diem[i]);
					} else {
						continue;
					}
					l1.remove(g);

				}
			} while (l1.size() > 0);
		} catch (NoSuchElementException e) {

		}

	}

}
