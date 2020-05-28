package designPatternDecorator;

public class ApplicationDecorPattern {

	public static void main(String[] args) {
		UnregCar car1= new UnregCar ("Peugeout",23);
		
		UnregCar car2= new UnregCar ("Renault",45);
		UnregCarDecorator carDecn =new UnregCarDecorator(car2);
		
		car1.getPrice();
		carDecn.getPrice();

	}

}
