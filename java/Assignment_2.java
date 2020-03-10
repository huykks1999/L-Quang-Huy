package Assignments;

public class Assignment_2 {

	public static void main(String[] args) {
//Questions 1:
		
String họ[] = {"Lê","Trần","Nguyễn","Cao","Trương","Đào","Tống"} ;
String Tên_đệm[] = {"Văn", "Phong","Hồng","Thị", "Quang", "Thanh", "Tiến"};
String Tên[] = {"Huy", "Việt", "Cường", "Trang", "Hiếu", "Anh", "Hoa"};
String Full_name[] = {"Lê Quang Huy","Trần Quang Hiếu","Cao Thị Trang","Tống Thanh Hoa","Cao Tiến Cường",
		"Đào Quang Việt","Lê Quang Anh","Nguyễn Thanh Trang","Cao Hồng Anh","Trương Thị Hoa"};

//Questions 2:
String ID[] = {"SV1234567","SV3344334","SV7644543","SV1275358","SV0787654","SV1276345","SV6543454",
		"SV3745764","SV6784123","SV1847273"};

//Questions 3:
String Birth_date[]= {"29/10/1991", "29/09/1991", "29/08/1991", "29/07/1991", "29/06/1991", "29/05/1991",
		"29/04/1991", "29/03/1991", "29/02/1991", "29/01/1991"};


//Questions 4:
System.out.println("Full_name                      ID                     Date      ");
System.out.println("------------------------------------------------------------------");
	for (int i = 0; i<ID.length;i++ ) {
		//String info[] = {Full_name[i], ID[i], Birth_date[i]};
		System.out.println(Full_name[i]+"              "+ID[i]+"                "+Birth_date[i]);
	}
	
	
	System.out.println();
}
}