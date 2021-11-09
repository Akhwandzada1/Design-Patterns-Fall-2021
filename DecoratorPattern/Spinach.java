package DecoratorPattern;

public class Spinach extends PizzaDecorator {
	public Spinach(Pizza pizza) {
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
