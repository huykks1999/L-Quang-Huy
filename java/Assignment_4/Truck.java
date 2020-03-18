package Assignment_4;

public class Truck extends Car {
    
	int weigh;
    double SalesPrice;
    
    public Truck(int speed, int regularPrice, String color, int weigh) {
		super(speed, regularPrice, color);
		super.speed = speed;
		super.regularPrice =regularPrice;
		super.color = color;
		this.weigh = weigh;
	}

   
    @Override
    double getSalesPrice() {
    	if (weigh > 2000) {
    		SalesPrice = regularPrice*0.9;
    	}else {
    		SalesPrice = regularPrice*0.8;
    	}
    	
    	return SalesPrice;
    }
}
