package DecoratorPatternExample;

public abstract class ShapeDecorator implements Shape {
	Shape target;
	public ShapeDecorator(Shape target) {
		this.target=target;
	}
}
