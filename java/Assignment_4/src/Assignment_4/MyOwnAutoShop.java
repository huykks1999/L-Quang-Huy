package Assignment_4;

public class MyOwnAutoShop {

	public static void main(String[] args) {
          Sedan sedan = new Sedan(80, 1000000, "red", 30);
          
          Ford ford1 = new Ford(80, 2000000, "blue", 1999, 500000);
          
          Ford ford2 = new Ford(90, 3000000, "green", 2000, 800000);
          
          Car car = new Car(100, 5000000, "grey");
          
          sedan.getSalesPrice();
          ford1.getSalesPrice();
          ford2.getSalesPrice();
          System.out.println(sedan.SalesPrice);
          System.out.println(ford1.SalesPrice);
          System.out.println(ford2.SalesPrice);
          
          
          
          
          
         
	}

}
