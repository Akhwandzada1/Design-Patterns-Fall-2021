package CreatorsFactoryMethod;

import ShapeFactoryMethod.Circle;
import ShapeFactoryMethod.Shape;

public class CircleGeometry extends Geometry {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
