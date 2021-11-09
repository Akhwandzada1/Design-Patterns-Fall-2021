package PrototypePattern;

public class Rectangle extends Shape{
	private int width;
	private int height;
	public Rectangle(String color, int width, int height){
		super(color);
		this.width = width;
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public Rectangle(Rectangle rectangle){
		super(rectangle);
		width=rectangle.width;
		height=rectangle.height;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return new Rectangle(this);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle || !super.equals(obj)))
			return false;
		Rectangle newRectangle=(Rectangle) obj;
		if((newRectangle.getWidth()==this.width)&&(newRectangle.getHeight()==this.height))
			return false;
		else
			return false;
	}
}
