package designPatternDecorator;

public class UnregCarDecorator implements TollGatePayable {
 protected TollGatePayable tollGateDecorated;
 
 public UnregCarDecorator (TollGatePayable tollGateDecorated) {
	 this.tollGateDecorated=tollGateDecorated;
 }
	@Override
	public String getPrice() {
		tollGateDecorated.getPrice();
		System.out.println ("price decorated ");
		return null;
	}

}
