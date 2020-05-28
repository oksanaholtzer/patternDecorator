package designPatternDecorator;

public class UnregCar implements TollGatePayable	{
 String brand;
 int price;
 
 
 public UnregCar(String brand , int price) {
	 this.brand=brand;
	 this.price=price;
 }
	@Override
	public String getPrice() {
		System.out.println ( "brand "+brand);
		System.out.println ( "price "+price);
		return null;
	}

}
