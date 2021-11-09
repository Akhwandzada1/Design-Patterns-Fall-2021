package CreatorsFactoryMethod;

import ShapeFactoryMethod.Rectangle;
import ShapeFactoryMethod.Shape;

public class RectangleGeometry extends Geometry {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}
	
}
