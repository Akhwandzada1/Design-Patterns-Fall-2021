package DecoratorPattern;

public class Chicken extends PizzaDecorator {

	public Chicken(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String getDesc() {
		return null;
	}

}
