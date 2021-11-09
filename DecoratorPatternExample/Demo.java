package DecoratorPatternExample;

public class Demo {

	public static void main(String[] args) {
		Shape rectangle=new Rectangle();
		System.out.println("Rectangle with normal border");
		rectangle.draw();
		System.out.println("Rectangle with red border");
		Shape redRectangle=new RedBorderDecorator(rectangle);
		redRectangle.draw();
		
	}

}
