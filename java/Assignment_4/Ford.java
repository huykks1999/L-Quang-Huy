package Assignment_4;

public class Ford extends Car {
	int year;
	int manufacturerDiscount;
	double SalesPrice;
	
	Ford( int speed, int regularPrice, String color,int year, int manufacturerDiscount ){
		super(speed, regularPrice, color);
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		
		
	}
	
	@Override
	double getSalesPrice() {
		SalesPrice = regularPrice - manufacturerDiscount;
		
		return SalesPrice;
		
	}
}
