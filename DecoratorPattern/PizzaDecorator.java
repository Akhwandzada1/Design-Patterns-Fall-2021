package DecoratorPattern;

public abstract class PizzaDecorator implements Pizza {
	Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public abstract double getPrice();
	

}
