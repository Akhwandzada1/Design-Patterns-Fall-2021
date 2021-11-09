package DecoratorPattern;

public class Cheese extends PizzaDecorator {

	public Cheese(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDesc() {
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
