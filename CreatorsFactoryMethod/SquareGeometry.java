package CreatorsFactoryMethod;

import ShapeFactoryMethod.Shape;
import ShapeFactoryMethod.Square;

public class SquareGeometry extends Geometry {

	@Override
	public Shape createShape() {
		return new Square();
	}
}
