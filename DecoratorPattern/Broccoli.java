package DecoratorPattern;

public class Broccoli extends PizzaDecorator {
	public Broccoli(Pizza pizza) {
		super(pizza);
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
