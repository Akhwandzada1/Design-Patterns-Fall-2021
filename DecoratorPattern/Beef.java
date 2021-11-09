package DecoratorPattern;

public class Beef extends PizzaDecorator {
	public Beef(Pizza pizza) {
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
