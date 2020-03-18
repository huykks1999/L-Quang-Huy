package Assignment_4;

public class Sedan extends Car {
	int length;
	double SalesPrice;
	
	Sedan( int speed, int regularPrice, String color,int length ){
		super(speed, regularPrice, color);
		super.speed = speed;
		super.regularPrice =regularPrice;
		super.color = color;
		this.length = length;
		
		
	}

	@Override
	double getSalesPrice() {
         if(length > 20) {
        	 SalesPrice = regularPrice*0.95;
         }else {
        	 SalesPrice = regularPrice*0.9;
         }
		return SalesPrice;
	}
}
